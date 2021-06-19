package com.lessons.lesson7.practise;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    private String name;
    private String messageText;
    private Date sentDate;

    public MessageData() {
    }

    public MessageData(String name, String messageText, Date sentDate) {
        this.name = name;
        this.messageText = messageText;
        this.sentDate = sentDate;
    }

    public MessageData(String name, String messageText) {
        this.name = name;
        this.messageText = messageText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String toString() {
        return "\"" + messageText + "\"" + " from " + name + " at " + sentDate.toString();
    }
}
