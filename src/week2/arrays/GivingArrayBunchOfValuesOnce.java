package week2.arrays;

import java.util.Random;

public class GivingArrayBunchOfValuesOnce {
	public static void main( String[] args )
	{
        String[] arr1 = { "alpha", "bravo", "charlie","delta","echo" };

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
        System.out.println();
        
        Random random = new Random();
        int[] rdmArray = new int[5];

		System.out.print("The second array is filled with the following values:\n\t");
        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(100 + 1);
            System.out.printf("%s ", rdmArray[i]);
        }


	}
}