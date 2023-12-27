package com.example.demo;
import com.example.demo.SimInterface;

public class EthioTel implements SimInterface{
    public EthioTel() {
        System.out.println("object created");

    }

    @Override
    public void calling() {
        System.out.println("Calling with EthioTel Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing with EthioTel Sim");
    }
}

