package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name? ");
        String userName = scanner.next();

        System.out.println("Hi, " + userName + "! How old are you? ");
        int userAge = scanner.nextInt();
        int userAgePlusFive = userAge + 5;
        int userAgeMinusFive = userAge + 5;

        System.out.println(String.format("Did you know that in five years you will be %d years old?", userAgePlusFive));
        System.out.println(String.format("And five years ago you were %d! Imagine that!", userAgeMinusFive));

        scanner.close();
    }
}