import java.util.Scanner;

public class NameAgeSalary{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        System.out.println("What is your name?");
        String userName = in.nextLine();

        System.out.println(String.format("Hi %s! How old are you?",userName));
        String userAge = in.nextLine();

        System.out.println(String.format("So you're %s, eh?  That's not old at all!\nHow much do you make, %s?", userAge, userName));
        String userSalary = in.nextLine();

        System.out.println(
            String.format("%s!  I hope that's per hour and not per year! LOL!", userSalary)
        );
        in.close();
    }
}