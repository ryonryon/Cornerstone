package week2.arrays;

import java.util.Random;

public class WhereIsIt {
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
    
            System.out.printf("Value to find: " );
            int userInput = Integer.parseInt(System.console().readLine());

            boolean isThereUserInput = false;

            for(int j = 0; j < rdmArray.length; j++) {
                if(userInput == rdmArray[j]) {
                    System.out.printf("%s is in the array.\n", userInput);
                    isThereUserInput = true;
                }
            }

            if(!isThereUserInput) {
                System.out.printf("%s is not in the array.\n", userInput);
            }

        } catch(NumberFormatException e) {
            System.out.println("You must enter integer");
        }
    }
}