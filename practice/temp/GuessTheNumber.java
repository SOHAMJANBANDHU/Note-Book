package practice;

	
	import java.util.Random;
	import java.util.Scanner;

	public class GuessTheNumber {
	    public static void main(String[] args) {
	        int minRange = 1;
	        int maxRange = 100;
	        
	        Random random = new Random();
	        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	        
	        System.out.println("Welcome to Guess the Number game!");
	        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);
	        
	        Scanner scanner = new Scanner(System.in);
	        int attempts = 0;
	        
	        while (true) {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;
	            
	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low. Try again!");
	            } else {
	                System.out.println("Too high. Try again!");
	            }
	        }
	        
	        scanner.close();
	    }
	}
