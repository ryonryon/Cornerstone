package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class ThereOrNot {
    public static void main(String[] args) {

        try{
        
            Random rdm = new Random();
        
            ArrayList<Integer> randomNum = new ArrayList<Integer>();
    
            for (int i = 0; i < 10; i++) {
    
                int ranNum = rdm.nextInt(50) + 1;
                randomNum.add(ranNum);
            }
    
            System.out.println("ArrayList: " + randomNum );

            System.out.printf("Value to find: ");
            int userInput = Integer.parseInt(System.console().readLine());

            boolean isThereUserInput = false;

            for(int ranNum : randomNum) {
                if(ranNum == userInput) {
                    System.out.printf("%s is in the ArrayList.\n", userInput);

                    isThereUserInput = true;
                }
            }

            if(!isThereUserInput) {
                System.out.printf("%s is not in the ArrayList.\n", userInput);
            }

        } catch(NumberFormatException e) {
            System.out.println("You must enter Integer.");
        }
    }
}