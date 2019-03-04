package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        
        Random rdm = new Random();

        ArrayList<Integer> randomNum = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            randomNum.add(rdm.nextInt(100) + 1);
        }

        System.out.println("ArrayList: " + randomNum );
    }
}