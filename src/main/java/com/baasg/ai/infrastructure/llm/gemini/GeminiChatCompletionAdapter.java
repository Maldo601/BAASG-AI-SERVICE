package com.baasg.ai.infrastructure.llm.gemini;

import java.util.Objects;

import org.springframework.ai.google.genai.GoogleGenAiChatModel;
import com.baasg.ai.application.port.output.ChatCompletionPort;

public class GeminiChatCompletionAdapter implements ChatCompletionPort {

    private final GoogleGenAiChatModel chatModel;

    public GeminiChatCompletionAdapter(GoogleGenAiChatModel chatModel) {
        this.chatModel = Objects.requireNonNull(chatModel);
    }

    @Override
    public String complete(String prompt) {
        return chatModel.call(prompt);
    }
}