package io.yorkecao.servicedemo.service;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author Yorke
 */
@Service
public class Publisher {

    private final JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    public Publisher(JmsMessagingTemplate jmsMessagingTemplate) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
    }

    /**
     * 发布消息
     * @param destinationName 目的地名称
     * @param message 消息
     */
    public void publish(String destinationName, String message) {
        System.out.println("Sending an email message.");
        Destination destination = new ActiveMQTopic(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
