package io.yorkecao.servicedemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {

    @Autowired
    private Producer producer;

    @Test
    public void produce() {
        for (int i = 0; i < 10; i++) {
            producer.produce("queue", "message: " + i);
        }
    }
}