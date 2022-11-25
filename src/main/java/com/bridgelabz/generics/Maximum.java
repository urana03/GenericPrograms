package com.bridgelabz.generics;

import java.util.*;

public class Maximum 
{
	public static void maxInt() {
		String stringOne = "Apple";
		String stringTwo = "Peach";
		String stringThree= "Banana";
		String max = null;
		
		if(stringOne.compareTo(stringTwo) > 0 && stringOne.compareTo(stringThree) > 0) {
			max = stringOne;
		}
		else if (stringTwo.compareTo(stringOne) > 0 && stringTwo.compareTo(stringThree) > 0) {
		    max = stringTwo;
		}
		else if(stringThree.compareTo(stringOne) > 0 && stringThree.compareTo(stringTwo) > 0) {
			max = stringThree;
		}
		else {}
		System.out.print("The maximum in strings is : "+max);
	}
	
    public static void main( String[] args )
    {
        maxInt();
    }
}
