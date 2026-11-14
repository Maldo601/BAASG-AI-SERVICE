package com.baasg.ai.infrastructure.llm;

import com.baasg.ai.application.model.AIProvider;

public interface AIProviderAdapter {

    AIProvider provider();

    String complete(String prompt);
}