package week1.forloops;

public class FizzBuzz{
    public static void main(String[] args) {
        
        for(int i = 1; i <= 100; i++) {
            String outputWord = "";
            if(i % 3 == 0) {
                outputWord += "Fizz";
            }
            if(i % 5 ==0) {
                outputWord += "Buzz";
            }
            if(outputWord.equals("")) {
                outputWord += Integer.toString(i); 
            }
            System.out.println(outputWord);
        }
    }
}