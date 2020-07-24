package day06;

public class CheckSumOfThrees {
	public static void main(String[] args) {
		/*
		 * write a method that accepts an array and prints true if the sum of all 3's in
		 * the array is exactly 9
		 * 
		 * Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
		 */

		int input[] = { 2, 3, 4, 5, 6, 3, 7 };
	// 4) call method and print result
		System.out.println(isNine(input));

	}

	// 1) create a return method
	public static boolean isNine(int input[]) {
		boolean result = true;
		int sum = 0;

	// 2) find sum of 3's
		for (int each : input) {
			if (each == 3) {
				sum += each;
			}
		}
	// 3) check sum if it is equal to 9 or not
		if (sum != 9) {
			result = false;
		}
		return result;
	}
}
