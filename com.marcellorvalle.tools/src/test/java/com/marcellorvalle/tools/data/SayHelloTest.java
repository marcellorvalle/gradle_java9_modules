package com.marcellorvalle.tools.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SayHelloTest {
    @Test
    void testSay() {
        assertEquals("Hello!", SayHello.say());
    }
}
