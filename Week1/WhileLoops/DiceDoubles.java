import java.util.Random;

public class DiceDoubles{
    public static void main(String[] args) {
        Random rn = new Random();

        while(true){
            int answerOne = rn.nextInt(6) + 1;
            int answerTwo = rn.nextInt(6) + 1;

            System.out.println(String.format("Roll #1: %s", answerOne));
            System.out.println(String.format("Roll #2: %s", answerTwo));
            System.out.println(String.format("The total is %s !", answerOne + answerTwo));

            if(answerOne == answerTwo) {
                break;
            }
        }
    }
}