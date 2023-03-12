package com.example.circleciw23;

import com.example.circleciw23.dice.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTests
{
    @Test
    public void constructorTest()
    {
        Dice die = new Dice(6, "red");
        assertEquals("red", die.getColor());
        assertEquals(6, die.getSides());
    }

    @Test
    public void rollTest()
    {

    }

    @Test
    public void rollManyTest()
    {

    }
}
