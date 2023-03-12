package com.example.circleciw23;

import com.example.circleciw23.dice.Dice;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTests
{
    @Test
    public void constructorTest()
    {
        Dice die = new Dice(6, "red");
        assertEquals("red", die.getColor());
        assertEquals(6, die.getSides());
    }

    @RepeatedTest(10)
    public void rollTest()
    {
        Dice dice = new Dice(10, "blue");
        int roll = dice.roll();
        rollCheck(roll, 1, 10);
    }

    private static void rollCheck(int roll, int min, int max)
    {
        assertTrue(roll <= max);
        assertTrue(roll >= min);
    }

    @Test
    public void rollManyTest()
    {
        Dice dice = new Dice(12, "orange");
        int[] rollMany = dice.rollMany(10);

        for (int i = 0; i < rollMany.length; i++)
        {
            rollCheck(rollMany[i], 1, 12);
        }
    }
}
