package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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

    @org.junit.Test
    public void mapAB4(){


        Map<String, String> result1 = obiekt.mapAB4(
                new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))
        );
        Map<String, String> result2 = obiekt.mapAB4(
                new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))
        );

        Map<String, String> result3 = obiekt.mapAB4(
                new HashMap<>(Map.of("a", "aa", "b", "bbb"))
        );
        assertEquals(Map.of("a", "aaa", "b", "bb", "c", "aaa"), result1);
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"), result2);
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"), result3);
    }

    @org.junit.Test
    public void pairs(){
        Map<String, String> result1 = obiekt.pairs(new String[]{"code", "bug"});
        Map<String, String> result2 = obiekt.pairs(new String[]{"man", "moon", "main"});
        Map<String, String> result3 = obiekt.pairs(new String[]{"man", "moon", "good", "night"});
        Map<String, String> result4 = obiekt.pairs(new String[]{"", "", "good", "night"});

        assertEquals(Map.of("c","e", "b", "g"), result1);
        assertEquals(Map.of("m","n"), result2);
        assertEquals(Map.of("m","n", "g", "d", "n", "t"), result3);
        assertEquals(Map.of("g","d","n","t"), result4);
    }
}