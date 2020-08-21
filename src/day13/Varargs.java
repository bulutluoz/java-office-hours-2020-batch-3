package day13;

public class Varargs {

	public static void main(String[] args) {
		/* Write a return method that accepts more than one integer as parameter
		 * and prints the sum of integers 
		 * 
		 * Method name = sum
		 * if you call method like that sum(1,2,3) output =6
		 *                              sum(1,2,3,4,5) output =15
		 *                              sum(1,2) output=3
		 */
		
		sum(1,2,3);
	}
	
	public static void sum(int... x) {
		int sum = 0;
		
		for (int w : x) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
}
