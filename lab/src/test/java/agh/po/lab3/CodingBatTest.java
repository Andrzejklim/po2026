package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat obiekt = new CodingBat();

    @org.junit.Test
    public void sleepIn() {


        boolean result1 = obiekt.sleepIn(true, true);
        boolean result2 = obiekt.sleepIn(true, false);
        boolean result3 = obiekt.sleepIn(false, true);

        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
    }

    @org.junit.Test
    public void icyHot() {
        boolean result1 = obiekt.icyHot(101, -5);
        boolean result2 = obiekt.icyHot(20, 5);
        boolean result3 = obiekt.icyHot(101, 0);

        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
    }

    @org.junit.Test
    public void haveThree() {
        boolean result1 = obiekt.haveThree(new int[]{3,1,2,3,5,3});
        boolean result2 = obiekt.haveThree(new int[]{3,1,2,3,3,5,3});
        boolean result3 = obiekt.haveThree(new int[]{3,1,2,3,5});

        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
    }

    @org.junit.Test
    public void lastTwo() {
        String result1 = obiekt.lastTwo("apple");
        String result2 = obiekt.lastTwo("google");
        String result3 = obiekt.lastTwo("superior");

        assertEquals("appel", result1);
        assertEquals("googel", result2);
        assertEquals("superiro", result3);
    }
}