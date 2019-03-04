package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class WhereIsIt {
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

            for(int i = 0; i <= randomNum.size() - 1; i++) {
                if(userInput == randomNum.get(i)) {
                    System.out.printf("%s is in slot %s\n", userInput, i + 1);

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