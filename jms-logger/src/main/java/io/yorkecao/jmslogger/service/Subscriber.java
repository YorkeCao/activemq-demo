package io.yorkecao.jmslogger.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author Yorke
 */
@Service
public class Subscriber {

    @JmsListener(destination = "topic", containerFactory = "myJmsListenerContainerFactory")
    public void subscribe(String message) {
        System.out.println("Received <" + message + ">");
    }
}
