package day06;

public class CheckingElementInArray {

	public static void main(String[] args) {
		/*
		 * create a method to test if an array contains a specific value returns true or
		 * false Then print the result in main method
		 * 
		 * input[]= {1,2,3,4,5,6,7} num:6 Output : “Array contains 6”
		 */

		int input[] = { 1, 2, 3, 4, 5, 6, 7 };
		int num = 9;
		// 4)check the result and print output

		if (checkElement(input, num)) {
			System.out.println("The input array contains " + num);
		} else
			System.out.println("The input array does not contain " + num);

	}

	// 1)create a return method
	public static boolean checkElement(int input[], int num) {
		// 2)compare num with every element from array

		boolean result = false;
		for (int each : input) {

			if (each == num) {
				result = true;
			}
		}

		// 3)return result
		return result;
	}

}
