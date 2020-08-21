package day13;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		/* Ask to user enter a positive integer 
		 * and calculate  the squareroot with three decimal number
		 * 
		 * Eg : Input =2 Output=1,415
		 *      Input =9 Output=3,000
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter A Positive Integer To Find The Squareroot");
		int input=scan.nextInt();
		
		double sr=1;
		for (double i = 1; i*i <=input; i+=0.001) {
			sr=i;
		}
		
		System.out.printf("%.5f",sr);
		


	}

}
