package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessagingApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("message-config.xml");
        SMSService message = (SMSService) context.getBean("smsservice", messageService.class);
        message.sendMessage();
    }
}
