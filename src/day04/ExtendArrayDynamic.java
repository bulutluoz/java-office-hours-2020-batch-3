package day04;

import java.util.Arrays;

public class ExtendArrayDynamic {
	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array which has 3 elements 
		 * and returns a new array with 3 times more the length 
		 * where its first and last element is the
		 * same as the original array, put middle number of original array into the
		 * middle of your new array
		 */
		
		int input[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(longArray(input)));
	}
	
	public static int[] longArray(int input[]) {
		int longArray[]= new int[input.length*3];
		
		if (input.length%2==0) {   // if the length of array even
			
			
			longArray[longArray.length/2-1]= input[input.length/2-1];
			longArray[longArray.length/2]= input[input.length/2];
			
			for (int i = 0; i < longArray.length; i++) {
				if (i<(input.length/2-1)) {
					longArray[i]=input[i];
					longArray[longArray.length-i-1]=input[input.length-i-1];
			} 
			}
			
			
			
			
		} else {					// if the length of array odd
			longArray[longArray.length/2]= input[input.length/2];
			for (int i = 0; i < longArray.length; i++) {
				if (i<(input.length/2)) {
					longArray[i]=input[i];
					longArray[longArray.length-i-1]=input[input.length-i-1];
			} 
			}
			
		}
		
		
		
		
		
		return longArray;
	}

}