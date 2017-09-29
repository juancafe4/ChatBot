package com.example.juancarlos.chatbot;

/**
 * Created by juancarlos on 9/29/17.
 */

public class ChatMessage {


    public String message;
    public String date;

    public ChatMessage(String message, String date) {
        this.message = message;
        this.date = date;
    }
    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setMessage(String message) {\
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
