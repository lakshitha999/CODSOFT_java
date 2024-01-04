
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
     public static final Random R = new Random();
     public static final int MAX_NUMBER = 100;
     public static void main(String[] args) {
    	 int numberToFind = R.nextInt(MAX_NUMBER) + 1;
    	 Scanner sc = new Scanner(System.in);
    	 int numberOfTries=0, Guessednumber=0;
    	 
    	 while(Guessednumber != numberToFind) {
    		 System.out.println("Can you guess the number?");
    		 System.out.println("Enter your guess:");
    		 Guessednumber = sc.nextInt();
    		 numberOfTries++;
    		 
    		 if (Guessednumber < 1 || Guessednumber >MAX_NUMBER) {
    			 System.out.println("Enter your guess between 1 and " + MAX_NUMBER);
    		 } else if (Guessednumber > numberToFind) {
    			 System.out.println("Your guess is too high !");
    		 } else if (Guessednumber < numberToFind) {
    			 System.out.println("Your guess is too low !");
    		 }
    	 }
    	 sc.close();
    	 System.out.println("Congragulations you found the number " + numberToFind + " in " + numberOfTries + " try ");
    }
}

   