package io.yorkecao.servicedemo.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author Yorke
 */
@Service
public class Producer {

    private final JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    public Producer(JmsMessagingTemplate jmsMessagingTemplate) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
    }

    /**
     * 发送消息
     * @param destinationName 目的地名称
     * @param message 消息
     */
    public void produce(String destinationName, String message) {
        System.out.println("Sending an email message.");
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
