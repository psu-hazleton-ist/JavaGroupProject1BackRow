package project1;
import java.util.Scanner;
import java.util.Random;

public class Class1{

  public static void main(String[] args) {
 	Random generator = new Random();
 	Scanner keyboard = new Scanner(System.in);   
 
 int[] specialNumbers = {10, 15, 20, 25, 30, 35};
 System.out.println("The possible numbers are [10, 15, 20, 25, 30, 35]!");
 	 
 int randomNumber = 10;
 
 	 
 	int guess = 0;
 	int score = 0;
        

 	
 	for (int i = 0; i < 12; i++){
 		randomNumber = generator.nextInt(6);
 		System.out.println("Enter a number to guess: ");	
 	    guess = keyboard.nextInt();
 	    score = processGuess(guess, specialNumbers[randomNumber], score);
 	    
 	}
 	if(score < 2) {
 		System.out.println("You did poorly ");
 		
 	}
 	else if(score >= 2) {
 		System.out.println(" You succeeded ");
 	}
 	System.out.println("Your score was: " + score);
 	
  }    
  
  private static int processGuess(int guess, int number, int score) {
	  if(guess == number) {
	    	System.out.println("You guessed correctly! The number was " + number);
	    	score++;
	    }
	    else if(guess != 10 && guess != 15 && guess != 20 && guess != 25 && guess != 30 && guess != 35) {
	    	System.out.println("That's not a valid number! The correct number was " + number);
	    }
	    else {
	    	System.out.println("Sorry! The number was " + number);
	    }
	  return score;
  }
  }      
  
