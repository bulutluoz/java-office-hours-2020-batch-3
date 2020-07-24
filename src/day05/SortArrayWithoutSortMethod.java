package day05;

import java.util.ArrayList;

import java.util.List;

public class SortArrayWithoutSortMethod {

	public static void main(String[] args) {
		/*
		 * write a return method that can prints an array in Ascending order without using
		 * the sort method of the Arrays class 
		 * Input : {6,2,4,3,1,5} 
		 * Output :{1,2,3,4,5,6}
		 */
		
		int input[]= {6,2,4,3,1,5} ;
		sortWithoutSortMethod(input );
	}
	
	public static void sortWithoutSortMethod(int input[] ) {
		
		List<Integer> inputList = new ArrayList<>();
		
		for(int each:input) {
			inputList.add(each);
		}
		
		List<Integer> outputList = new ArrayList<>();

		while(inputList.size()>0) {
			
			int min=Integer.MAX_VALUE;
			
			for (int i = 0; i < inputList.size(); i++) {
					
						if (inputList.get(i)<min) {
							min=inputList.get(i);
						}
			}
			
			outputList.add(min);
			inputList.remove(inputList.indexOf(min));
		}

		System.out.println("output " + outputList);
		 
	}
}
	


