package day04;

public class PrintingNumbersJavaIsTheBest {

	public static void main(String[] args) {
		/*
		 * Interview Question : write a method which prints out the numbers from 1 to 33
		 * but for numbers which are a multiple of 3, print Java instead of number 
		 * and  for numbers which are a multiple of 5, print Best instead of the number. 
		 * 
		 * For numbers which are a multiple by of both 3 and 5, print JavaIsTheBest instead
		 * of the number
		 */

		int input= 33;
		int num1=3;
		int num2=5;
		count(input,num1,num2);
		
	}
	
	   public static void count(int input, int num1 , int num2) {
		   
		   for (int i = 1; i <= input; i++) {
			   
			   if (i%5==0 && i%3==0) {
				System.out.println("JavaIsTheBest");
			} else if (i%3==0) {
				System.out.println("Java");
			} else if (i%5==0) {
				System.out.println("Best");
			} else System.out.print(i +" ");

		}
	   }

}
