package com.example.websocketdemo;

/**
 * A model for the messages sent by our WebSocket server.
 */
public class Message {

    private String from;
    private String text;

    // getters and setters
    public String getFrom() {
        return from;
    }
    public String getText() {
        return text;
    }
}
