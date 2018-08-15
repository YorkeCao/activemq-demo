package io.yorkecao.jmslogger.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @JmsListener(destination = "queue")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
