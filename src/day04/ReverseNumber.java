package day04;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 * Interview questions…
		 * 
		 * write a return method to reverse number 
		 * 
		 * Input : 12345 Output : 54321
		 */

		int input= 1234567;
		System.out.println("Reverse of given number :" + reverseNumber(input));
	}

	public static int reverseNumber(int input) {
		int reverseNum=0;
		while(input>0) {
			
			reverseNum=reverseNum*10+ input%10;
			input=input/10;
			
		}
		
		return reverseNum;
	}
}
