package com.example.demo;
import com.example.demo.EthioTel;
import com.example.demo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
    public static void main (String[] args){
//        EthioTel ethioTel = new EthioTel();
//        ethioTel.data();
//        ethioTel.calling();
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
        SimInterface sim = context.getBean("ethiotel", SimInterface.class);
        sim.data();
        sim.calling();

    }


}
