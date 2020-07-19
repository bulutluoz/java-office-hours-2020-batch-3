package day01;

import java.util.Scanner;

public class FindingBMI {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute body mass index (BMI) 
		 * print the situation. 
		 * Isuser weak, fat or obese ?
		 * 
		 * (Hint BMI = weight(kg)/ (height*height)(m) 
		 * BMI<20 weak 
		 * 20<BMI<25 healthy
		 * 25<BMI<30 fat 
		 * Over 30 obese
		 */

		// 1- Get weight and height from user
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" Please enter your weight as kg");
		double weight = scan.nextDouble();
		System.out.println(" Please enter your height as cm");
		double height = scan.nextDouble();
		height= height/100 ;
		// 2- Calculate BMI
		
		double bmi = weight/(height*height) ;
		
		// 3- Compare BMI with limits and print result
		
		if (bmi<=20) {
			System.out.println("You are weak");
		} else if (bmi<=25) {
			System.out.println("You are healthy");
		} else if (bmi<=30) {
		    System.out.println("You are fat");	
		} else  {System.out.println("You are obese");
		}
		
		scan.close();
	}

}
