package com.marcellorvalle.consumer;

import org.junit.jupiter.api.Test;

public class ConsumerTest {
    @Test
    void sayTest() {
        Consumer c = new Consumer();
        c.saySomething();
    }
}
