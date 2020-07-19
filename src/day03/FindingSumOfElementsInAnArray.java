package day03;

public class FindingSumOfElementsInAnArray {

	static int sum=0;
	public static void main(String[] args) {
		/*/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array 
		 * 
		 * Then print the result, in the main method
		 * 
		 * Eg : input : {1,2,3,4,5,6,7,8}; 
		 *      output: 36
		 * 
		 */
		
		int input[]={1,2,3,4,5,6,7,8};
		
		// 4) print sum 
		
		sumOfElements (input);
		System.out.println("Sum of all element : " + sum);

	}
	
	// 1) create method
	// 2) find the sum of all elements of array
	public static int sumOfElements (int input[]) {
		
		
		for (int each: input) {
			sum+= each ;
		}
	// 3) return with sum
		return sum;
	}
	
	
	

}
