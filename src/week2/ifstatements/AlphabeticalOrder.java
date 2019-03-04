package week2.ifstatements;

import java.util.Scanner;

public class AlphabeticalOrder{
    public static void main(String[] args) {
        System.out.printf("What's your last name?");
        Scanner scn = new Scanner(System.in);

        String lastName = scn.nextLine();

        if(lastName.compareTo("Carswell") == -1) {
            System.out.println("you don't have to wait long");

        } else if(lastName.compareTo("Jones") == -1) {
            System.out.println("that's not bad");

        } else if(lastName.compareTo("Smith") == -1) {
            System.out.println("looks like a bit of a wait");

        } else if(lastName.compareTo("Young") == -1) {
            System.out.println("it's gonna be a while");

        } else {
            System.out.println("not going anywhere for a while?");
        }
        
        scn.close();
    }
}