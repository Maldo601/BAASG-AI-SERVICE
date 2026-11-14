package com.baasg.ai.application.service;

import java.util.Objects;

import com.baasg.ai.application.port.input.GenerateChatResponseCaseUse;
import com.baasg.ai.application.port.output.ChatCompletionPort;

public class GenerateChatResponseService implements GenerateChatResponseCaseUse {

    private final ChatCompletionPort chatCompletionPort;

    public GenerateChatResponseService(ChatCompletionPort chatCompletionPort) {
        this.chatCompletionPort = Objects.requireNonNull(chatCompletionPort);
    }

    @Override
    public String generate(String prompt) {
        return chatCompletionPort.complete(prompt);
    }
}