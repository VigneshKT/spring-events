package org.example.model;

import org.example.events.DomainEvent;

public class Email implements DomainEvent {

    private String sender;
    private String receiver;
    private String message;

    private Email(String sender,String receiver,String message){
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public static Email create(String sender,String receiver,String message){
        return new Email(sender,receiver,message);
    }

    @Override
    public String toString() {
        return "Email{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
