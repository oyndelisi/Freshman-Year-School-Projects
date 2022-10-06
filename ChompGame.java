import java.util.Arrays;

public class ChompGame {
String[][] game;
int player = 1;	
	public ChompGame(int rows, int cols) {
		game = new String[rows + 1][cols + 1];
		for (int h = 0; h < rows + 1; h++) {
			for (int p = 0; p < cols + 1; p++) {
				game[h][p] = "*";
			}
		}
		game[0][0] = " ";
		for (int i = 1; i < (cols + 1); i++) 
			game[0][i] = Integer.toString((i - 1));
		for (int j = 1; j < (rows + 1); j++) 
			game[j][0] = Integer.toString((j - 1));
		
		
		
	}
	
	public boolean checkIfChomped(int row, int col) {
		if (game[row + 1][col + 1] == "*")
			return false;
		else return true;
	}
	
	public boolean isLegalChomp(int row, int col) {
		if (row >= game.length - 1 || row < 0 || col >= game[0].length - 1 || col < 0) {
			System.out.println("That is not a legal chomp position.");
			return false;
		}
		else if (checkIfChomped(row, col) == true) {
			System.out.println("That is not a legal chomp position.");
			return false;
		}
		
		else return true;
			
	}
	
	public boolean chompAt(int row, int col) {
		if (isLegalChomp(row, col) == true) {
			
			for (int i = row + 1; i < game.length; i++)
				for (int j = col + 1; j < game[0].length; j++)
					game[i][j] = " ";
			player++;
			return true;
		}
		else return false;
	}
	
	public boolean isGameOver() {
		if (game[1][1] == "*")
				return false;
		else return true;
		
	}
	
	public int getRows() {
		return game.length - 1;
	}
	
	public int getCols() {
		return game[0].length - 1;
	}
	
	public int getCurrentPlayer() {
		if (player % 2 == 0)
			return 2;
		else return 1;
	}
	
	public java.lang.String toString() {
		
		StringBuilder ms = new StringBuilder();
		for (int row = 0; row < game.length; row++) {
			for (int column = 0; column < game[0].length; column++) {
				ms.append(game[row][column]);
			}
			ms.append('\n');
		}
			String s = ms.toString();
			return s;
		}
	

}
