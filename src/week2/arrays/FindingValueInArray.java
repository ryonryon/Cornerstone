package week2.arrays;

import java.util.Random;

public class FindingValueInArray {
    public static void main(String[] args) {

        try {
            Random random = new Random();
            int[] rdmArray = new int[10];
    
            System.out.printf("Array: ");
            
            for(int i = 0; i < rdmArray.length; i++) {
                rdmArray[i] = random.nextInt(50 + 1);
                System.out.printf("%s ", rdmArray[i]);
            }
            System.out.println("");

            System.out.printf("Value to find: ");
            int userInput = Integer.parseInt(System.console().readLine());

            for(int ranNum: rdmArray) {
                if(ranNum == userInput) {
                    System.out.printf("%s is in the array.\n", userInput);
                }
            }


        } catch(NumberFormatException e) {
            System.out.println("You must enter integer.");
        }
    }
}