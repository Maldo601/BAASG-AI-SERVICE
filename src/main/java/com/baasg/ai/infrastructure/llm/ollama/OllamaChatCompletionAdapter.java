package com.baasg.ai.infrastructure.llm.ollama;

import java.util.Objects;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Component;

import com.baasg.ai.application.model.AIProvider;
import com.baasg.ai.infrastructure.llm.AIProviderAdapter;

@Component
public class OllamaChatCompletionAdapter implements AIProviderAdapter {

    private final OllamaChatModel chatModel;

    public OllamaChatCompletionAdapter(OllamaChatModel chatModel) {
        this.chatModel = Objects.requireNonNull(chatModel);
    }

    @Override
    public AIProvider provider() {
        return AIProvider.OLLAMA;
    }

    @Override
    public String complete(String prompt) {
        return chatModel.call(prompt);
    }
}