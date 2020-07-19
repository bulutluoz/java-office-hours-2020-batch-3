package day04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

				Scanner scan = new Scanner(System.in);
				Random random = new Random();
				int userChoose = 0;
				int compChoose = 0;
				int user = 0;
				int comp = 0;
				
				do {
					// User Selection
					System.out.println("Please, choose...");
					System.out.println("1 - Rock");
					System.out.println("2 - Paper");
					System.out.println("3 - Scissors");
					userChoose = scan.nextInt();
					// Random Computer Selection
					compChoose = random.nextInt(3) + 1;
					
					// Compare and give points
					if (userChoose == 1 && compChoose == 2) {
						System.out.println("Paper > Rock Computer +1 point.");
						comp++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else if (userChoose == 1 && compChoose == 3) {
						System.out.println("Rock > Scissors User +1 point.");
						user++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else if (userChoose == 2 && compChoose == 1) {
						System.out.println("Paper > Rock User +1 point.");
						user++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else if (userChoose == 2 && compChoose == 3) {
						System.out.println("Scissors > Paper Computer +1 point.");
						comp++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else if (userChoose == 3 && compChoose == 1) {
						System.out.println("Rock > Scissors Computer +1 point.");
						comp++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else if (userChoose == 3 && compChoose == 2) {
						System.out.println("Scissors > Paper User +1 point.");
						user++;
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					} else {
						System.out.println("Its a tie.");
						System.out.println("User : " + user + " // " + "Computer : " + comp);
					}
	
				} while (user !=5 && comp !=5);
				{
					// Print Winner
					if (user > comp) {
						System.out.println("You are the winner.");
					} else {
						System.out.println("Computer is the winner.");
					}
				}
				scan.close();
			}
		}
