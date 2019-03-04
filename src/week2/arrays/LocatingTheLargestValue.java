package week2.arrays;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {

        Random random = new Random();
        int[] rdmArray = new int[10];

        System.out.printf("Array: ");
        
        int largestValue = 0;
        int largestValueIndex = 0;

        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(50 + 1);
            System.out.printf("%s ", rdmArray[i]);

            if(largestValue == 0 || largestValue < rdmArray[i]) {
                largestValue = rdmArray[i];
                largestValueIndex = i;
            }
        }
        System.out.println("");

        System.out.println("The largest value is " + largestValue);
        System.out.println("It is in slot " + largestValueIndex);
    }
}