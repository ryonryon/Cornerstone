package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        
        Random rdm = new Random();
    
        ArrayList<Integer> randomNum = new ArrayList<Integer>();

        int largestValue = 0;
        int largestLocate = 0;

        for (int i = 0; i < 10; i++) {

            int ranNum = rdm.nextInt(100) + 1;
            randomNum.add(ranNum);

            if(largestValue == 0 || largestValue < ranNum) {
                largestValue = ranNum;
                largestLocate = i + 1;
            }
        }

        System.out.println("ArrayList: " + randomNum );
        System.out.printf("The largest value is %s, which is in slot %s\n", largestValue, largestLocate);
    }
}