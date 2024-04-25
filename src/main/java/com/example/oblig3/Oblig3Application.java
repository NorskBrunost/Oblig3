package com.example.oblig3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Oblig3Application {


    @Autowired
    BillettRepository billettRepository;

    public static void main(String[] args) {
        SpringApplication.run(Oblig3Application.class, args);
    }

}
