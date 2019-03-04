package week1.ForLoops;

import java.util.Scanner;

public class CountingMachine{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.printf("Count to:");
        int targetInt = scn.nextInt();

        for(int i = 0; i <= targetInt; i++) {
            System.out.printf("%s ", i);
        }

        System.out.println("");
        scn.close();
    }
}