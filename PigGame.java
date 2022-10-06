import java.util.Scanner;

public class PigGame {

	public static int rollDice() {

		int min = 1;
		int max = 6;
		int range = (max - min) + 1;
		int roll = (int)(Math.random() * range) + min;
		return roll;
	}
		
	public static int choosePlayer() {
		int min = 1;
		int max = 2;
		int range = (max - min) + 1;
		int who = (int)(Math.random() * range) + min;
		return who;
		
	}

	
	
	public static void main(String[] args) {
		
		int playerFactor = choosePlayer();
		int player1 = 0;
		int player2 = 0;
		int player = 1;
		Scanner input = new Scanner(System.in);
		
		if (playerFactor == 1) {
			System.out.print("You will be player 1.\n");
			player = 1;
		}
		else if (playerFactor == 2) {
			System.out.print("You will be player 2.\n");
			player = 0;
		}
		System.out.print("Enter nothing to roll; enter anything to hold.\n");
		
		while (player1 < 100 && player2 < 100) {
		
		if (player == 1 && (player1 < 100 && player2 < 100)) {
			if (playerFactor == 1) {
			System.out.print("Player 1 score: " + player1 + "\n");
			System.out.print("Player 2 score: " + player2 + "\n");
			}
			else if (playerFactor == 2) {
				System.out.print("Player 1 score: " + player2 + "\n");
				System.out.print("Player 2 score: " + player1 + "\n");
			}
			if (playerFactor == 1)
			System.out.print("It is player 1's turn.\n");	
			if (playerFactor == 2)
				System.out.print("It is player 2's turn.\n");	
		

			
		for (int hold = 0, end = 4, turnTotal = 0; hold == 0 && end != 1 && player == 1;) {
			int roll = rollDice();
			player1 += roll;
			turnTotal += roll;
			hold = 1;
			System.out.print("Roll: " + roll + "\n");
			if (roll == 1) {
				player1 -= turnTotal;
				turnTotal = 0;
				end = 1;
				System.out.print("Turn total: " + turnTotal + "\n");
				System.out.print("New score: " + player1 + "\n");
				player = 0;
				break;
			}
			System.out.print("Turn total: " + turnTotal + "   Roll/Hold? ");
			String a = input.nextLine();
			int length = a.length();
			if (length > 0)
				end = 1;
			if (length == 0)
				hold = 0;
			
			if (hold == 1 || turnTotal == 0) {
				System.out.print("Turn total: " + turnTotal + "\n");
				System.out.print("New score: " + player1 + "\n");
				player = 0;
			}
			}
		}
		if (player == 0 && (player1 < 100 && player2 < 100)) {
			if (playerFactor == 1) {
			System.out.print("Player 1 score: " + player1 + "\n");
			System.out.print("Player 2 score: " + player2 + "\n");
			}
			if (playerFactor == 2) {
				System.out.print("Player 1 score: " + player2 + "\n");
				System.out.print("Player 2 score: " + player1 + "\n");	
			}
			if (playerFactor == 1)
			System.out.print("It is player 2's turn.\n");
			if (playerFactor == 2)
				System.out.print("It is player 1's turn.\n");
		
		
		for (int hold = 0, end = 4; hold < 20 && end != 1 && player == 0; ) {
			int roll = rollDice();
			player2 += roll;
			hold += roll;
			System.out.print("Roll: " + roll + "\n");
			if (roll == 1) {
				player2 -= hold;
				hold = 0;
				end = 1;	
			}
			if (hold >= 20 || hold == 0 || player2 >= 100) {
				System.out.print("Turn total: " + hold + "\n");
				System.out.print("New score: " + player2 + "\n");
				player = 1;
		}
		
			}
		}
	}
	}
}
