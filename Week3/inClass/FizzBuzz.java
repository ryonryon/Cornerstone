import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.io);
        int maxVal = scn.nextInt();
        
        for(int i = 1; i <= maxVal; i++) {
            String outputWord = "";
            if(i % 3 == 0) {
                outputWord += "Fizz";
            }
            if(i % 5 == 0) {
                outputWord += "Buzz";
            }
            if(outputWord.equals("")) {
                outputWord += Integer.toString(i); 
            }
            if(i % 20 == 0) {
                System.out.println(outputWord);
                continue;
            }
            System.out.printf(outputWord + " ");
        }
        scn.close();
    }
}