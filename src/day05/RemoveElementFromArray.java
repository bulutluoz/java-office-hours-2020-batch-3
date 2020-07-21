package day05;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array ant prints the new array 
		 * Input  : {1,2,3,4,5,6} element:6 
		 * Output : [1,2,3,4,5]
		 * 
		 * 
		 */
		
		
		int input[]= {1,2,3,4,5,6,7};
		int remove=4;
		
		
		List<Integer> list =new ArrayList<>();
		
		for (int each:input) {
			
			if (each!=remove) {
				list.add(each);
			}
			
		}
		
		System.out.println(list);
		
		int newArray[]= new int[list.size()];
		
		for (int i = 0; i < newArray.length; i++) {
			
			newArray[i]= list.get(i);
		}
		
		
		
		
		

	}

}
