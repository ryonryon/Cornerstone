package week2.ifstatements;

public class ChooseYourOwnShortAdventure{
    public static void main(String[] args) {

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");

        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        String choise = checkAnswer("upstairs", "kitchen");

        if(choise.equals("upstairs")) {
            goToUpstair();
        } else {
            goToKitchen();
        }
        
    }

    private static void goToUpstair() {
        System.out.println("There cockroaches everywhere.but we have food.");
        System.out.println("You may open the \"refrigerator\" or look in a \"food strage\".");
        String choise = checkAnswer("refrigerator", "food strage");

        if(choise.equals("refrigerator")) {
            openFrige();
        } else {
            openStrage();
        }

    }

    private static void goToKitchen() {
        System.out.println("There is a long countertop with dirty dishes everywhere.");
        System.out.println("Off to one side there is, as you'd expect, a refrigerator.");
        System.out.println("You may open the \"refrigerator\" or look in a \"food strage\".");
        String choise = checkAnswer("refrigerator", "food strage");

        if(choise.equals("refrigerator")) {
            openFrige();
        } else {
            openStrage();
        }
    }

    private static void openFrige() {
        takeFoodOrNot("frige");
    }
    private static void openStrage() {
        takeFoodOrNot("strage");
    }
    private static void takeFoodOrNot(String container) {
        System.out.println("Inside the " + container + " you see food and stuff.  It looks pretty nasty.");
        System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");

        String choise = checkAnswer("yes", "no");

        if(choise.equals("yes")) {
            System.out.println("ok.. go ahead.");
        } else {
            System.out.println("You die of starvation... eventually.");
        }

    }

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