package com.bridgelabz.testmaximum;

public class FindMaximumValue {
   // Used Integer Object and compareTo method to test the maximum number
    // Method to find the maximum Integer
    public static <E extends Comparable> E findMaximumValueGenericMethod(E a, E b, E c){
        E max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        return max;
    }
}
