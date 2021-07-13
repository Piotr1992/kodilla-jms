package com.kodilla.orderjms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping(path = "/process")
    public void processOrder(@RequestParam String order) {
        jmsTemplate.convertAndSend("queue-test", order);
    }

}