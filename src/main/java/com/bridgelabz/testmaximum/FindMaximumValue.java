package com.bridgelabz.testmaximum;

public class FindMaximumValue {
   // Used Integer Object and compareTo method to test the maximum number
    // Method to find the maximum Integer
    public static int findMaximumInteger(Integer a, Integer b, Integer c){
        Integer max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        return max;
    }
   // Method to find the maximum float Value
    public static Float findMaximumFloat(Float a, Float b, Float c){
        Float max = a;
        if(max.compareTo(b)<0.0f)
            max=b;
        if(max.compareTo(c)<0.0f)
            max=c;
        return max;
    }
}
