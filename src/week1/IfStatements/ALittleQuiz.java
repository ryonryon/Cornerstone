package week1.IfStatements;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ALittleQuiz {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int ansCount = 3;

        System.out.println("Are you ready for a quiz? (Yes/No)");
        boolean ans = answer(scn);
        if (ans == false) {
            System.out.println("Your answer is wrong. You shold have chosen yes!");
            return;
        }

        System.out.println("Are you human? (Yes/No)");
        boolean ansTwo = answer(scn);

        if (ansTwo == false) {
            ansCount -= 1;
            System.out.println("Oops, You must be human");
        } else {
            System.out.println("yes, You are human");
        }

        System.out.println("How many whole do you have?");
        System.out.println("5: y");
        System.out.println("6: n");
        boolean ansThree = answer(scn);

        if (ansThree == true) {
            ansCount -= 1;
            System.out.println("Oops, You must have 6 wholes");
        } else {
            System.out.println("yes, You have 6 wholes");
        }

        System.out.printf("Overall, you got %s out of 3 correct.\n", ansCount);
        scn.close();
    }

    private static boolean answer(Scanner scn) {

        boolean ans;
        List<String> yesArr = new ArrayList<String>(Arrays.asList("yes", "", "y"));
        List<String> noArr = new ArrayList<String>(Arrays.asList("no", "", "n"));

        while (true) {
            String answer = scn.next();

            if (yesArr.contains(answer.toLowerCase())) {
                ans = true;
                break;

            } else if (noArr.contains(answer.toLowerCase())) {
                ans = false;
                break;
            }
            System.out.println("Can you answer again?");
        }
        return ans;
    }

}