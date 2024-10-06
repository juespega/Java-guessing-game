import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create an instance of the Random class to generate the random number
        Random random = new Random();
        // Create an instance of the Scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 0 and 100 (exclusive)
        int randomNumber = random.nextInt(101); // The upper limit is exclusive, so it is 101 to include 100.
        System.out.println(randomNumber);
        // Definition of variables
        int user_option = 0;
        int attempts = 0;
        int maxAttempts = 5;
        boolean guessed = false; // Variable to indicate if the number was guessed

        System.out.println("Welcome to the guessing game!");
        System.out.println("Guess the number I'm thinking of (between 0 and 100). You have 5 attempts.");

        // Loop to control user attempts
        while (attempts < maxAttempts){
            System.out.println("Attempt " + (attempts + 1) + ": enter you number: ");
            user_option = scanner.nextInt(); // Read the number entered by the user

            // Check if the number is correct
            if (user_option == randomNumber){
                System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
                guessed = true; // Marked as guessed
                break;
            } else if (user_option < randomNumber){
                System.out.println("The number is higher");
            } else {
                System.out.println("The number is smaller");
            }

            attempts++; // Increment attempt counter
                
        }
        // Check if attempts have been exhausted and the number has not been guessed
        if(!guessed){
            System.out.println("Sorry, you have exhausted your 5 attempts. The number was " + randomNumber + ".");
        }
        // Close the scanner
        scanner.close();
    }
}