package com.baasg.ai.application.model;

/**
 * - Todos los que se incluyan en ENUM, se deberan pasar al switch provider -
 * del ChatCompletionRouter
 */
public enum AIProvider {
    OLLAMA, GEMINI, OPENAI, ANTHROPIC, MISTRAL, DEEPSEEK, GROQ, AZURE_OPENAI
}
