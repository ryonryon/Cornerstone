package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        
        Random rdm = new Random();
    
        ArrayList<Integer> randomNum = new ArrayList<Integer>();

        int largestValue = 0;

        for (int i = 0; i < 10; i++) {

            int ranNum = rdm.nextInt(100) + 1;
            randomNum.add(ranNum);

            if(largestValue == 0 || largestValue < ranNum) {
                largestValue = ranNum;
            }
        }

        System.out.println("ArrayList: " + randomNum );
        System.out.println("The largest value is " + largestValue);

    }
}