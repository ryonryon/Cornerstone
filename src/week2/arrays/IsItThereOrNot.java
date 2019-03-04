package week2.arrays;

import java.util.Random;

public class IsItThereOrNot {
    public static void main(String[] args) {

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

        int countUserInput = 0;

        for(int ranNum: rdmArray) {
            if(ranNum == userInput) {
                countUserInput++;
            }
        }
        if(0 < countUserInput) {
            System.out.printf("%s is in the array.\n", userInput);
        } else {
            System.out.printf("%s is not in the array.\n", userInput);
        }
    }
}