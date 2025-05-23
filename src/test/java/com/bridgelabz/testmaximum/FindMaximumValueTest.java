package com.bridgelabz.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumValueTest {

    //Test case for First maximum Integer value
    @Test
    public void findMaxIntegerAtFirstPos() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 70, 30);
        int expectedValue = 100;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Second maximum Integer value
    @Test
    public void findMaxIntegerAtSecondPos() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 700, 30);
        int expectedValue = 700;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Third maximum Integer value
    @Test
    public void findMaxIntegerAtThirdPos() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 70, 300);
        int expectedValue = 300;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum Float value
    @Test
    public void findMaxFloatAtFirstPos() {
        Float actualValue = FindMaximumValue.findMaximumFloat(100.4f, 70.4f, 30.4f);
        Float expectedValue = 100.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }

    //Test case for Second maximum Float value
    @Test
    public void findMaxFloatAtSecondPos() {
        Float actualValue = FindMaximumValue.findMaximumFloat(100.4f, 700.4f, 30.4f);
        Float expectedValue = 700.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Third maximum Float value
    @Test
    public void findMaxFloatAtThirdPos() {
        Float actualValue = FindMaximumValue.findMaximumFloat(100.4f, 70.4f, 300.4f);
        Float expectedValue = 300.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 1st position
    @Test
    public void findMaxStringAtFirstPos() {
        String actualValue = FindMaximumValue.findMaximumString("Peach","Apple", "Banana");
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 2nd position
    @Test
    public void findMaxStringAtSecondPos() {
        String actualValue = FindMaximumValue.findMaximumString("Apple","Peach" ,"Banana");
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 3rd position
    @Test
    public void findMaxStringAtThirdPos() {
        String actualValue = FindMaximumValue.findMaximumString("Apple","Banana" ,"Peach");
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }

}