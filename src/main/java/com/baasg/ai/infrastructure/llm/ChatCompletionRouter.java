package com.baasg.ai.infrastructure.llm;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.baasg.ai.application.model.AIProvider;
import com.baasg.ai.application.port.output.ChatCompletionPort;

@Component
public class ChatCompletionRouter implements ChatCompletionPort {

    private final Map<AIProvider, AIProviderAdapter> adapters;

    public ChatCompletionRouter(List<AIProviderAdapter> adapters) {

        this.adapters = new EnumMap<>(AIProvider.class);

        for (AIProviderAdapter adapter : adapters) {
            AIProvider provider = adapter.provider();

            if (this.adapters.putIfAbsent(provider, adapter) != null) {
                throw new IllegalStateException("Multiple adapters registered for provider: " + provider);
            }
        }
    }

    @Override
    public String complete(String prompt, AIProvider provider) {

        Objects.requireNonNull(provider, "AIProvider cannot be null");

        AIProviderAdapter adapter = adapters.get(provider);

        if (adapter == null) {
            throw new IllegalArgumentException("Provider not implemented: " + provider);
        }

        return adapter.complete(prompt);
    }
}
