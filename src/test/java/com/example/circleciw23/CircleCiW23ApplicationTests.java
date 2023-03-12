package com.example.circleciw23;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CircleCiW23ApplicationTests
{
    @Test
    void contextLoads()
    {
    }

    @Test
    public void testMe()
    {
        assertTrue(true);
        int random = new Random().nextInt();
        assertTrue(random > Integer.MIN_VALUE);
    }

    @Test
    public void anotherTest()
    {
        String value = "hello";
        assertNotNull(value);
    }
}
