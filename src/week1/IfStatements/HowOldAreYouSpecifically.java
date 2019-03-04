package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");

        String name = scn.nextLine();

        System.out.print(String.format("Ok, %s, how old are you? ", name));

        int age = scn.nextInt();
        scn.nextLine();

        System.out.println("");

        if (age < 16) {
            System.out.println(String.format("You can't drive, %s.", name));
        } else if (age < 18) {
            System.out.println(String.format("You can drive but not vote, %s.", name));
        } else if (age < 25) {
            System.out.println(String.format("You can vote but not rent a car, %s.", name));
        } else {
            System.out.println(String.format("You can do pretty much anything, %s.", name));
        }

        scn.close();
    }
}