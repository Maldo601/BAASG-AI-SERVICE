
package com.baasg.ai.infrastructure.llm.ollama;

import java.util.Objects;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Component;

import com.baasg.ai.application.port.output.ChatCompletionPort;

@Component
public class OllamaChatCompletionAdapter implements ChatCompletionPort {

    private final ChatModel chatModel;

    public OllamaChatCompletionAdapter(ChatModel chatModel) {
        this.chatModel = Objects.requireNonNull(chatModel);
    }

    @Override
    public String complete(String prompt) {
        return chatModel.call(prompt);
    }
}
