package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class FindingValueInArrayList {
    public static void main(String[] args) {

        try{
        
            Random rdm = new Random();
    
            ArrayList<Integer> randomNum = new ArrayList<Integer>();
    
            for (int i = 0; i < 10; i++) {
                randomNum.add(rdm.nextInt(50) + 1);
            }
    
            System.out.println("ArrayList: " + randomNum );

            System.out.printf("Value to find: ");
            int userInputInt = Integer.parseInt(System.console().readLine());

            for (int ranNum : randomNum) {
                if(ranNum == userInputInt) {
                    System.out.printf("%s is in the ArrayList.\n", userInputInt);
                }
            }

        } catch(NumberFormatException e) {

            System.out.println("You must enter integer type.");
        }
    }
}