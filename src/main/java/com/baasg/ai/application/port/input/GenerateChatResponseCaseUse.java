package com.baasg.ai.application.port.input;

import com.baasg.ai.application.model.AIProvider;

public interface GenerateChatResponseCaseUse {

    String generate(String prompt, AIProvider provider);
}