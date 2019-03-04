package week2.arrays;

import java.util.Random;

public class BasicArrays2{
    public static void main(String[] args) {

        Random random = new Random();
        int[] rdmArray = new int[10];
        
        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(100 + 1);
            System.out.printf("Slot %s contains a %s\n", i, rdmArray[i]);
        }
    }
}