import java.util.Scanner;

public class AddingValuesInLoop{
    public static void main(String[] args) {
        
        System.out.printf("I will add the number you give me");

        Scanner scn = new Scanner(System.in);
        int inputSum = 0;
        
        while(true) {
            System.out.printf("Number:");
            int inputInt = scn.nextInt();

            if(inputInt == 0) {
                break;
            }
            inputSum += inputInt;
            System.out.println(String.format("The total so far is %s", inputSum));
        }

        scn.close();
    }
}