package org.example.events;

import org.example.model.Email;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventConsumer implements DomainEvent {

    @EventListener
    public void emailNotificationListerner(DomainEvent domainEvent){
        System.out.println(domainEvent.toString());
    }

}
