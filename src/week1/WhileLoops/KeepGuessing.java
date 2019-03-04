package week1.WhileLoops;

import java.util.Scanner;
import java.util.Random;

public class KeepGuessing{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int tagerInt = random.nextInt(10) + 1;

        while(true){

            System.out.printf("Your guess: ");
            int userGuess = scn.nextInt();

            if(userGuess == tagerInt) {
                System.out.println("That's right! You're a good guesser.");
                
                break;
            }
            System.out.println("That is incorrect. Guess again.");
        }
        scn.close();
    }
}