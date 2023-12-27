package com.example.demo;
import com.example.demo.messageService;

public class SMSService implements messageService{
    @Override
    public void sendMessage() {
System.out.println("sending message");
    }
}
