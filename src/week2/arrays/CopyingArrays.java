package week2.arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {

        Random random = new Random();
        int[] rdmArray = new int[10];
        
        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(100 + 1);
        }
        int[] rdmArray2 = rdmArray.clone();

        rdmArray[9] = -7;

        
        for(int j = 0; j < rdmArray.length; j++) {
            System.out.printf("%s ", rdmArray[j]);
        }

        System.out.println();

        for(int k = 0; k < rdmArray.length; k++) {
            System.out.printf("%s ", rdmArray2[k]);
        }

    }
}