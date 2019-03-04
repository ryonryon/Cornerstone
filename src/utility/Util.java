package utility;

public class Util{
    
    public static String checkAnswer(String optionOne, String opsionTwo) {

        String answer = "";

        while(true) {
            answer = System.console().readLine();
            if(optionOne.equals(answer) || opsionTwo.equals(answer)) {
                break;
            }
            System.out.println("Say again?");
        }

        return answer;
    }
}