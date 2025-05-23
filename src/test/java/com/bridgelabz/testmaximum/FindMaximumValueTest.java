package com.bridgelabz.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumValueTest {

    //Test case for First maximum value
    @Test
    public void findFirstMaximumInteger() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 70, 30);
        int expectedValue = 100;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Second maximum value
    @Test
    public void findSecondMaximumInteger() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 700, 30);
        int expectedValue = 700;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Third maximum value
    @Test
    public void findThirdMaximumInteger() {
        int actualValue = FindMaximumValue.findMaximumInteger(100, 70, 300);
        int expectedValue = 300;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
}