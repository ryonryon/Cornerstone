package week2.ifstatements;

import java.util.Scanner;

public class SpaceBoxing{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.printf("Please enter your current earth weight: ");
        double earthWeight = scn.nextDouble();

        System.out.println("I have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");

        System.out.printf("Which planet are you visiting? ");
        int planetNum = scn.nextInt();

        double planetWeight = 0.0d;
        switch(planetNum) {
            case 1:
                planetWeight = earthWeight * 0.78;
                break;
            case 2:
                planetWeight = earthWeight * 0.39;
                break;
            case 3:
                planetWeight = earthWeight * 2.65;
                break;
            case 4:
                planetWeight = earthWeight * 1.17;
                break;
            case 5:
                planetWeight = earthWeight * 1.05;
                break;
            case 6:
                planetWeight = earthWeight * 1.23;
                break;
        }
        System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planetWeight));

        scn.close();
    }
}