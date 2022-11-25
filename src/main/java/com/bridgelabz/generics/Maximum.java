package com.bridgelabz.generics;

import java.util.*;

public class Maximum 
{
	public static void maxInt() {
		Integer numOne = 900;
		Integer numTwo = 600;
		Integer numThree= 990;
		int max = 0;
		
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
