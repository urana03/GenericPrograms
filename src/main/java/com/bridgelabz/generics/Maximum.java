package com.bridgelabz.generics;

import java.util.*;

public class Maximum 
{
	public static <E extends Comparable <E>> E max(E one, E two, E three) {
	
		E max = null;
		
		if(one.compareTo(two) > 0 && one.compareTo(three) > 0) {
			max = one;
		}
		else if (two.compareTo(one) > 0 && two.compareTo(three) > 0) {
		    max = two;
		}
		else if(three.compareTo(one) > 0 && three.compareTo(two) > 0) {
			max = three;
		}
		else {}
		return max;
	}
	
    public static void main( String[] args )
    {
    	//compare integers
    	System.out.println("The max of 10,15 and 60 is: "+max(10,15,60));
    	
    	//compare floats
    	System.out.println("The max of 10.11,15.45 and 15.99 is: "+max(10.11f,15.45f,15.99f));
    	
    	//compare strings
    	System.out.println("The max of 10,15 and 60 is: "+max("Ram","Shyam","Kunwar"));
    }
}
