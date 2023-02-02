package com.example.websocketdemo;

/**
 * A model for the output messages sent by our WebSocket server.
 */
public class OutputMessage {

    private String from;
    private String text;
    private String time;

    public OutputMessage() {
    }

    public OutputMessage(String from, String text, String time) {
        this.from = from;
        this.text = text;
        this.time = time;
    }
    public String getFrom() {
        return from;
    }
    public String getText() {
        return text;
    }
    public String getTime() {
        return time;
    }
}
