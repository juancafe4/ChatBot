package com.example.juancarlos.chatbot;

/**
 * Created by juancarlos on 9/29/17.
 */

public class ChatMessage {


    private String message;
    private String date;
    private boolean isUser; // Did the user send the message

    public boolean getIsUser() {
        return isUser;
    }
    public void setIsUser(Boolean isUser) {
        this.isUser = isUser;
    }
    public ChatMessage(String message, String date, Boolean isUser) {
        this.message = message;
        this.date = date;
        this.isUser = isUser;
    }
    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
