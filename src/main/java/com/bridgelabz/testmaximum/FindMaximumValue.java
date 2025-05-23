package com.bridgelabz.testmaximum;
import java.util.Optional;
public class FindMaximumValue<E extends Comparable>  {
    E[] a;
    public FindMaximumValue(E... a) {
        this.a = a;
    }
    //Method to internally call the static findMaximum method passing the 3 instance variables
    public E testMaximum(){
        return findMaximum(a);
    }

    // Method to find the maximum value
    public static <E extends Comparable> E findMaximum(E... a){
        E max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(max)>0)
                max=a[i];
        }
        return max;
    }
}
