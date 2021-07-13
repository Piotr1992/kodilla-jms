package com.kodilla.orderjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class OrderJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderJmsApplication.class, args);
    }

}
