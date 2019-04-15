package review_final_exam;

public class Driver {
    public static void main(String[] args) {
        // Example Output
        // "is amazingly awesome java difficult NULL NULL"
        String[] words = { "java", "is", "amazingly", "awesome", "difficult" };
        RandomWordChooser chooser = new RandomWordChooser(words);
        for (int i = 0; i < words.length + 2; i++) {
            System.out.print(chooser.getNext() + " ");
        }

        // Example Output
        // "godNULL"
        // RandomCharChooser charChooser = new RandomCharChooser("dog");
        // for(int i = 0; i < 4; i++) {
        // System.out.print(charChooser.getNext());
        // }

    }
}
