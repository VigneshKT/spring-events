package org.example.events;

import org.example.model.Email;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventConsumer implements DomainEvent {

    @EventListener
    public void emailNotificationListerner(Email domainEvent){
        emailNotification(domainEvent.toString());
    }

    public void emailNotification(String message){
        System.out.println(message);
    }

}
