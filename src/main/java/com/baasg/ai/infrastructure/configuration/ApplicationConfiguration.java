package com.baasg.ai.infrastructure.configuration;

import org.springframework.ai.google.genai.GoogleGenAiChatModel;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baasg.ai.application.port.output.ChatCompletionPort;
import com.baasg.ai.application.port.input.GenerateChatResponseCaseUse;
import com.baasg.ai.application.service.GenerateChatResponseService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public GenerateChatResponseCaseUse generateChatResponseCaseUse(ChatCompletionPort chatCompletionPort) {
        return new GenerateChatResponseService(chatCompletionPort);
    }

    @Bean
    ApplicationRunner inspectGeminiModel(GoogleGenAiChatModel chatModel) {
        return args -> System.out.println("GEMINI MODEL: " + chatModel.getOptions().getModel());
    }
}
