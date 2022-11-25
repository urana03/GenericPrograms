package com.bridgelabz.generics;

import java.util.*;

public class Maximum 
{
	public static void maxInt() {
		Float numOne = 100f;
		Float numTwo = 990.1f;
		Float numThree= 990.12f;
		Float max = 0f;
		
		if(numOne.compareTo(numTwo) > 0 && numOne.compareTo(numThree) > 0) {
			max = numOne;
		}
		else if (numTwo.compareTo(numOne) > 0 && numTwo.compareTo(numThree) > 0) {
		    max = numTwo;
		}
		else if(numThree.compareTo(numOne) > 0 && numThree.compareTo(numTwo) > 0) {
			max = numThree;
		}
		else {}
		System.out.print("The maximum number:"+max);
	}
	
    public static void main( String[] args )
    {
        maxInt();
    }
}
