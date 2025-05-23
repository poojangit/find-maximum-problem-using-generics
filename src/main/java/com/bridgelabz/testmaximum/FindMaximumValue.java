package com.bridgelabz.testmaximum;

public class FindMaximumValue {
   // Used Integer Object and compareTo method to test the maximum number
    public static int findMaximumInteger(Integer a, Integer b, Integer c){
        Integer max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        return max;
    }
}
