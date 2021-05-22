package org.example.publishers;

import org.example.events.DomainEvent;

import java.util.Objects;

public class TwitterNotification implements DomainEvent {
    private String sender;
    private String twitt;
    private String message;
    private String channel;

    public TwitterNotification(String sender,String twitt,String message,String channel){
        this.sender = sender;
        this.twitt = twitt;
        this.message = message;
        this.channel = channel;
    }

    public static TwitterNotification create(String sender,String twitt,String message,String channel){
        return new TwitterNotification(sender,twitt,message,channel);
    }

    @Override
    public String toString() {
        return "TwitterNotification{" +
                "sender='" + sender + '\'' +
                ", twitt='" + twitt + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwitterNotification that = (TwitterNotification) o;
        return Objects.equals(sender, that.sender) &&
                Objects.equals(twitt, that.twitt) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, twitt, message);
    }
}
