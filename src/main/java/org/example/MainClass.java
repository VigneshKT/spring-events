package org.example;

import org.example.publishers.EmailNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass implements CommandLineRunner {

    
    private EmailNotification emailNotification;

    @Autowired
    public void setEmailNotification(EmailNotification emailNotification){
        this.emailNotification = emailNotification;
    }

    public static void main(String[] args){
        SpringApplication.run(MainClass.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        emailNotification.publishEmails();
    }
}
