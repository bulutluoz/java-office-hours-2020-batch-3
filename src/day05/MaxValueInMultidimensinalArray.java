package day05;

public class MaxValueInMultidimensinalArray {

	public static void main(String[] args) {
		/*
		 * write a method that accepts a 2 dimensional array and finds the max value
		 * 
		 * Input : {{1,2,3},{4,5},{6,7,8}} 
		 * Output : 8
		 * 
		 * 
		 */
		
		int input[][]={{1,2,3},{4,5},{6,7,8}};
		
		
		System.out.println("Max value for given array : " + findingMax(input));
		
	

	}
	
	public static int findingMax(int input[][]) {
		int max=input[0][0];
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = 0; j < input[i].length; j++) {
				
				if (input[i][j]>max) {
					max=input[i][j];
				}
			}
			
		}
		
		
		return max;
	}
	
	
	
	
	
	

}
