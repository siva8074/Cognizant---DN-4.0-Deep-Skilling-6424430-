package com.example.service;

public class MessageService {
    private MessageProvider provider;

    // Constructor Injection
    public MessageService(MessageProvider provider) {
        this.provider = provider;
    }

    public void printMessage() {
        System.out.println(provider.getMessage());
    }
}
