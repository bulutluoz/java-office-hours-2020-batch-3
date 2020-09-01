package day16;

import java.util.Scanner;

public class ScrabbleGame {
	static String word;
	static int player=1;
	static String yesNo;
	static int pointsP1=0;
	static int pointsP2=0;
	

	public static void main(String[] args) {
		/* Write a Scrabble Game for two person
		 * Rules
		 * OK== 1- At the beginning Ask to first Player enter a word for starting game
		 * OK 2- Then change the player ask to new player if given word is valid or not
		 * OK		i) If new player accepts the given word add number of letters in the word as points 
		 *         to player who wrote the word
		 *         And go to step 3
		 * OK     ii) If new player  does not accept the word as valid
		 *         then print "Invalid word, player X(Current player) won the game" and finish the game
		 *         
		 *OK  3- Ask to users if user want to continue game or not
		 *OK     i) If player want to continue, 
		 *OK       ask to user a letter to add to word 
		 *OK        and ask to user side to add (beginning or end)
		 *OK        then add letter to word and run step 2
		 *   
		 *OK    ii) If player does not want to continue 
		 *         then print "Game Finished" and print points  and winner    
		 *  
		 */
		
		// it is our last class. Thank you for listening me for 16 classes
		
		
		
		start();
		do { changePlayer();
			 
		if(accept()) {
		
			// returning true or false
			// i will check the result if player 2 accepts the word
			// we will add points to player 1
			 
			addPoints();
			continueGame();
			
		}
			
		
		else {
			
			// if player2 does not accept the word
			// it means player1 said invalid word so player1 will lose the game
			
			finishWithInvalidWord();
			yesNo="n";
			break;
			
		}
			
			
		}while(yesNo.equalsIgnoreCase("Y"));
		
			

	}

	public static void continueGame() {
		// I will ask to user if user wants to continue or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to continue the game "
				+ "\nY : yes  N:No");
		yesNo=scan.next();
		if (yesNo.equalsIgnoreCase("y")) { // It means player wants to continue
			
			System.out.println("please enter a letter to add the word");
			String letter=scan.next();
			System.out.println("please enter side to add the letter to the word "
					+ "\nB : beginnig  E:End");
			String side=scan.next();
			
			if(side.equalsIgnoreCase("b")) {
				//it means I will add letter to beginnig
				word=letter+word;
			} else word=word+letter;//It means I will add letter to the end
			
			
		}else {// It means player does not want to continue
			
			System.out.println("player 1 has " + pointsP1 + "points");
			System.out.println("player 2 has " + pointsP2 + "points");
			if (pointsP1>pointsP2) {
				System.out.println("Winner is player 1");
			}else System.out.println("Winner is player 2");
			yesNo="N";
		} 
		
		yesNo="y";
	}

	public static void finishWithInvalidWord() {
		// it means previous player said invalid word so winner will be current player
		System.out.println("Invalid word "
				+ "\nplayer " +player+ " won the game");
		
	}

	public static void addPoints() {
		// I will add numbers of letters in the word as points to previous player
		//I need to check current player because i will add points to previous player
		
		if (player==1) {
			pointsP2+=word.length();
		}else pointsP1+=word.length();
		
		
	}

	public static boolean accept() {
		// I will ask to user if given word is valid or not
		// and I will get users answer
		Scanner scan = new Scanner(System.in);
		System.out.println("player " + player + " Do you accept the word : " +word + "\nY :Yes N:No");
		yesNo=scan.next();
		
		if (yesNo.equalsIgnoreCase("Y")) {
			return true;
		}else  return false;
	}

	public static void changePlayer() {
		// I will change players 1 or 2
		if (player==1) {
			player=2;
		}else player=1;
		
	}

	public static void start() {
		// I will wellcome to players
		System.out.println("Welcome . Lets get started "
				+ "\nPlayer1 please enter a word to start");
		Scanner scan = new Scanner(System.in);
		word=scan.next();
		
	}

}
