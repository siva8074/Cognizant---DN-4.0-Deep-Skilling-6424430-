package com.example.service;

public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello from Spring Dependency Injection!";
    }
}
