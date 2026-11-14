package com.baasg.ai.application.port.output;

import com.baasg.ai.application.model.AIProvider;

public interface ChatCompletionPort {

    String complete(String prompt, AIProvider provider);
}