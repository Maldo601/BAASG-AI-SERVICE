package com.baasg.ai.presentation.rest.controllers;

import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baasg.ai.application.port.input.GenerateChatResponseCaseUse;
import com.baasg.ai.presentation.rest.dto.request.ChatRequest;
import com.baasg.ai.presentation.rest.dto.response.ChatResponse;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    private final GenerateChatResponseCaseUse generateChatResponseCaseUse;

    public ChatController(GenerateChatResponseCaseUse generateChatResponseCaseUse) {
        this.generateChatResponseCaseUse = Objects.requireNonNull(generateChatResponseCaseUse);
    }

    @PostMapping
    public ResponseEntity<ChatResponse> generate(@RequestBody ChatRequest request) {

        String response = generateChatResponseCaseUse.generate(request.prompt());

        return ResponseEntity.ok(new ChatResponse(response));
    }
}
