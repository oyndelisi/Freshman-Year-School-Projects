import java.util.Arrays;
import java.util.Scanner;

public class DiceHistogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many rolls? ");
		int numberRolls = input.nextInt();
		histogram(numberRolls);
	}
		
		public static int rollDice() {

			int min = 1;
			int max = 6;
			int range = (max - min) + 1;
			int roll = (int)(Math.random() * range) + min;
			return roll;
	}
		public static void histogram(int a) {
			
			int max = 0;
			int[] rollNumbers = new int[11];
			for (int i = 0; i < a; i++) {
				int roll1 = rollDice();
				int roll2 = rollDice();
				int roll = roll1 + roll2;
				rollNumbers[roll - 2] = rollNumbers[roll - 2] + 1;
				
				
			}
			max = getMax(rollNumbers);
			System.out.println("Max count: " + max);
				for (int i = 0; i < rollNumbers.length; i++) {
					double eachCount = Math.round(60.0 * rollNumbers[i] / max);
					System.out.printf("%2d ", (i + 2));
					for (int j = 0; j < eachCount; j++) {
				System.out.print("*");
					}
					System.out.println();
			
				}
			}
		
		
		public static int getMax(int[] a) {
			int max = a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) max = a[i];
			}
			return max;
		}
		
		

}
