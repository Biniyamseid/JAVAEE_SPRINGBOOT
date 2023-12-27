package com.example.demo;

public class Safaricom implements SimInterface{
    @Override
    public void calling() {
        System.out.println("Calling with Safaricom Sim");
    }
    @Override
    public void data() {
        System.out.println("Browsing with Safaricom Sim");
    }
}
