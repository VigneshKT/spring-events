package org.example.publishers;

import org.example.events.DomainEvent;

public class TwitterNotification implements DomainEvent {
    private String sender;
    private String twitt;
    private String message;

    public TwitterNotification(String sender,String twitt,String message){
        this.sender = sender;
        this.twitt = twitt;
        this.message = message;
    }

    public static TwitterNotification create(String sender,String twitt,String message){
        return new TwitterNotification(sender,twitt,message);
    }

    @Override
    public String toString() {
        return "TwitterNotification{" +
                "sender='" + sender + '\'' +
                ", twitt='" + twitt + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
