package com.baasg.ai.infrastructure.llm.gemini;

import java.util.Objects;

import org.springframework.ai.google.genai.GoogleGenAiChatModel;
import org.springframework.stereotype.Component;
import com.baasg.ai.application.model.AIProvider;
import com.baasg.ai.infrastructure.llm.AIProviderAdapter;

@Component
public class GeminiChatCompletionAdapter implements AIProviderAdapter {

    private final GoogleGenAiChatModel chatModel;

    public GeminiChatCompletionAdapter(GoogleGenAiChatModel chatModel) {
        this.chatModel = Objects.requireNonNull(chatModel);
    }

    @Override
    public AIProvider provider() {
        return AIProvider.GEMINI;
    }

    @Override
    public String complete(String prompt) {
        return chatModel.call(prompt);
    }
}