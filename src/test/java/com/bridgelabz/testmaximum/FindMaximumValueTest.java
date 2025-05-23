package com.bridgelabz.testmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumValueTest {

    //Test case for First maximum Integer value
    @Test
    public void findMaxIntegerAtFirstPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100, 70, 30);
        Comparable actualValue = maximumValue.testMaximum();
        int expectedValue = 100;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Second maximum Integer value
    @Test
    public void findMaxIntegerAtSecondPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100, 700, 30);
        Comparable actualValue = maximumValue.testMaximum();
        int expectedValue = 700;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Third maximum Integer value
    @Test
    public void findMaxIntegerAtThirdPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100, 70, 300);
        Comparable actualValue = maximumValue.testMaximum();
        int expectedValue = 300;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum Float value
    @Test
    public void findMaxFloatAtFirstPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100.4f, 70.4f, 30.4f);
        Comparable actualValue = maximumValue.testMaximum();
        Float expectedValue = 100.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }

    //Test case for Second maximum Float value
    @Test
    public void findMaxFloatAtSecondPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100.4f, 700.4f, 30.4f);
        Comparable actualValue = maximumValue.testMaximum();
        Float expectedValue = 700.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for Third maximum Float value
    @Test
    public void findMaxFloatAtThirdPos() {
        FindMaximumValue maximumValue = new FindMaximumValue(100.4f, 70.4f, 300.4f);
        Comparable actualValue = maximumValue.testMaximum();
        Float expectedValue = 300.4f;
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 1st position
    @Test
    public void findMaxStringAtFirstPos() {
        FindMaximumValue maximumValue = new FindMaximumValue("Peach","Apple", "Banana");
        Comparable actualValue = maximumValue.testMaximum();
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 2nd position
    @Test
    public void findMaxStringAtSecondPos() {
        FindMaximumValue maximumValue = new FindMaximumValue("Apple","Peach" ,"Banana");
        Comparable actualValue = maximumValue.testMaximum();
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }
    //Test case for First maximum String value at 3rd position
    @Test
    public void findMaxStringAtThirdPos() {
        FindMaximumValue maximumValue = new FindMaximumValue("Apple","Banana" ,"Peach");
        Comparable actualValue = maximumValue.testMaximum();
        String expectedValue = "Peach";
        assertEquals(expectedValue, actualValue, "The maximum value is not correct! The Expected Value is " + expectedValue );
    }

}