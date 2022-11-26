package com.bridgelabz.generics;

import java.util.*;

public class Maximum
{
	
	
	
	public static <E extends Comparable <E>> E max(E one, E two, E three, E four) {
	
		E max = null;
		
		if(one.compareTo(two) > 0 && one.compareTo(three) > 0 && one.compareTo(four) > 0) {
			max = one;
		}
		else if (two.compareTo(one) > 0 && two.compareTo(three) > 0 && two.compareTo(four) > 0) {
		    max = two;
		}
		else if(three.compareTo(one) > 0 && three.compareTo(two) > 0 && three.compareTo(four) > 0){
			max = three;
		}
		else if(four.compareTo(one) > 0 && four.compareTo(two) > 0 && four.compareTo(three) > 0) {
			max = four;
		}
		else {}
		return max;
	}
	public static void printMax() {
		
		Scanner scan = new Scanner(System.in);
    	System.out.print("Enert 1 to compare string, "
    			+ "\nEnter 2 to compare floats, "+"\nEnter 3 to compare integers:");
    	int check = scan.nextInt();
    	if(check == 1) {
    	
    		System.out.println("The maximum from Laugh,Good,Fairwell and Adios is: "+max("Laugh","Good","FairWell","Adios"));
    		
    	}
    	else if (check == 2) {
    		System.out.print("The mamimum from 15.01,15.02,16.01 and 16.05 is :"+
    	                                     max(15.01f,15.02f,16.01f,16.05f));
    	}
    	else {
    		System.out.print("The mamimum from 15,19,17 and 18 is: "+max(15,19,17,18));
    	}
		
	}
	
    public static void main( String[] args )
    {
    	printMax();
             
    }
}
