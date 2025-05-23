package com.bridgelabz.testmaximum;

public class FindMaximumValue<E extends Comparable>  {
    E a,b,c;
    public FindMaximumValue(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Method to internally call the static findMaximum method passing the 3 instance variables
    public E testMaximum(){
        return findMaximum(a,b,c);
    }

    // Method to find the maximum value
    public static <E extends Comparable> E findMaximum(E a, E b, E c){
        E max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        return max;
    }
}
