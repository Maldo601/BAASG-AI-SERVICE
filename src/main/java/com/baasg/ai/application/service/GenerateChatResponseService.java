package com.baasg.ai.application.service;

import com.baasg.ai.application.model.AIProvider;
import com.baasg.ai.application.port.input.GenerateChatResponseCaseUse;
import com.baasg.ai.application.port.output.ChatCompletionPort;
import java.util.Objects;

public class GenerateChatResponseService implements GenerateChatResponseCaseUse {

    private final ChatCompletionPort chatCompletionPort;

    public GenerateChatResponseService(ChatCompletionPort chatCompletionPort) {

        this.chatCompletionPort = Objects.requireNonNull(chatCompletionPort);
    }

    @Override
    public String generate(String prompt, AIProvider provider) {
        return chatCompletionPort.complete(prompt, Objects.requireNonNull(provider, "AIProvider cannot be null"));
    }
}
