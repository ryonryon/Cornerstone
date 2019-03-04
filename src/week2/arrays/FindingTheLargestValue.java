package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {

        Random random = new Random();
        int[] rdmArray = new int[10];
        int largestValue = 0;

        System.out.printf("Array: ");
        
        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(100 + 1);
            System.out.printf("%s ", rdmArray[i]);

            if(largestValue == 0 || largestValue < rdmArray[i]) {
                largestValue = rdmArray[i];
            }
        }
        System.out.println("");
        System.out.println("The largest value is " + largestValue);

    }
}