
plugins {
    id("com.baasg.spring-boot-conventions")
    id("com.baasg.testing-conventions")
    id("com.baasg.code-quality-conventions")
}

group = "com.baasg.ai"
version = "0.0.1"

repositories {
    mavenCentral()
}


dependencies {
    // Spring Boot BOM
    implementation(platform("org.springframework.boot:spring-boot-dependencies:4.1.2"))

    // Spring MVC
    implementation("org.springframework.boot:spring-boot-starter-webmvc")

    // Spring AI BOM
    implementation(platform("org.springframework.ai:spring-ai-bom:2.0.2"))

    // AI Providers
    implementation("org.springframework.ai:spring-ai-starter-model-ollama")
    implementation("org.springframework.ai:spring-ai-starter-model-google-genai")
}
