package com.baasg.ai.presentation.rest.dto.request;

import com.baasg.ai.application.model.AIProvider;

public record ChatRequest(String prompt, AIProvider provider) {
}
