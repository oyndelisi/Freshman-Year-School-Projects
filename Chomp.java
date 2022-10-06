import java.util.Arrays;
import java.util.Scanner;

public class Chomp {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("CHOMP\nIn the game of Chomp, players bite a rectangular cookie in turn.\n"
		+ "The player chomping the last bite (0,0) loses.\n"
		+ "Each chomp, a row and column, bites off all below and to the right.\n");
System.out.print("Rows? ");
int rows = input.nextInt();
System.out.print("Columns? ");
int cols = input.nextInt();
		ChompGame game1 = new ChompGame(rows, cols);
		
		while (game1.isGameOver() == false) {
			System.out.print("\n");
		System.out.print(game1.toString());
		System.out.print("\n");
		
		int player = game1.getCurrentPlayer();
		System.out.print("Player " + player + " chomp? ");
		int chompRow = input.nextInt();
		int chompCol = input.nextInt();
		game1.chompAt(chompRow, chompCol);
		
	}
		int player = game1.getCurrentPlayer();
		System.out.print("\n");
System.out.println("Player " + player + " wins!");
}
}
