package com.example.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("beanconfig3.xml");
            siminterface ethioTel = context.getBean("ethiotel",siminterface.class);
            System.out.println(ethioTel.getOperatorName() + " works with number: " + ethioTel.getPhoneNumber());

        }
    }

