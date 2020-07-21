package day05;

public class MaxAndMinValueOfAnArray {

	public static void main(String[] args) {
		/*
		 * write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * 
		 * 
		 * Input : {3,2,5,4,1,6} 
		 * Output : min: 1 max : 6
		 * 
		 * 
		 */
		
		
		int input[]={3,2,5,4,1,6};
		maxAndMin(input);

	}
	
	// 1)create method
	  
	 public static void maxAndMin(int input[]) {
			// 2) Find min and max value
			
		 
		 int max= input[0];
		 int min = input[0];
		 
		 for (int i = 0; i < input.length; i++) {
			
			 if (input[i]>max) {
				max=input[i];
			} if (input[i]<min) {
				min=input[i];
			}
			 
		}
		 
		// 3)Print the result 
		 
		 System.out.println("Min value in the array : " + min
				 +"\nMax value in the array : " + max);
	 
	 }
	
}
