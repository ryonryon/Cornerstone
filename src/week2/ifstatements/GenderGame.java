package week2.ifstatements;

import java.util.Scanner;

public class GenderGame{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.printf("What is your gender (M or F):");
        String gender = scn.nextLine();

        System.out.printf("First name: ");
        String firstName = scn.nextLine();

        System.out.printf("Last name: ");
        String lastName = scn.nextLine();

        System.out.printf("Age: ");
        int age = scn.nextInt();

        String whatICallYou = "Then, I shall call you ";

        if(20 <= age) {

            System.out.printf("Are you married, %s (y or n)? ", firstName);
            String marriedStatus = scn.nextLine();

            if(marriedStatus == "y" && gender == "F") {

                whatICallYou = whatICallYou + "Mrs. ";
            } else if(marriedStatus == "n" && gender == "F") {

                whatICallYou = whatICallYou + "Ms. ";
            } else {

                whatICallYou = whatICallYou + "Mr. ";
            }

            whatICallYou = whatICallYou + lastName;
        } else {

            whatICallYou += firstName + lastName;
        }

        System.out.println(whatICallYou);
        scn.close();
        
    }
}