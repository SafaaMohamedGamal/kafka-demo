package com.example.kafkademo;

public class MessageRequest {
    private String message;

    public MessageRequest() {
    }
    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
