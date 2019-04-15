package review_final_exam;

import java.util.Random;

public class RandomWordChooser {

    String[] words;

    public RandomWordChooser(String[] words) {
        this.words = words;

    }

    public String getNext() {

        Random rdm = new Random();

        return this.words[rdm.nextInt(this.words.length)];
    }
}
