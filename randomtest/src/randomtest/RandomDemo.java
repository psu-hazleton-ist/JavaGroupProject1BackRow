package randomtest;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);
		
//		String[] specials = {"Hello", "Goodbye", "World", "Love", "Weird", "Bizarre", "Excellent", "Lizards"};
		int[] specialNumbers = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		
		int randomNumber = generator.nextInt(9);
		
		int guess = 0;
		
		while(guess != specialNumbers[randomNumber]) {
			System.out.println("Enter a number to guess: ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("You guessed correctly! The number was " + specialNumbers[randomNumber]);
		
//		int randomNumber = generator.nextInt(8);
//		
//		System.out.println("Special " + specials[randomNumber]);
	}

}
