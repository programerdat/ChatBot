package com.programmerdat.chatbot;

public class Message {
    private Boolean type;
    private String message;

    public Message(boolean type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getType() {
        return type;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}
