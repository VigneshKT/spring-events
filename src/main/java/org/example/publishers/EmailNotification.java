package org.example.publishers;

import org.example.events.SpringEventPublisher;
import org.example.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification {

    private SpringEventPublisher publisher;

    @Autowired
    public void setPublisher(SpringEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEmails(){
       Email email =  Email.create("a","b","c");
       publisher.eventPublisher(email);
    }
}
