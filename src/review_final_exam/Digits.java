package review_final_exam;

import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * Precondition: num >= 0
     * @param num
     * Example 1
     * Digits d1 = new Digits(12345);
     * digitList = [1, 2, 3, 4, 5];
     *
     * Digits d2 = new Digits(0);
     * digitList = [0];
     */
    public Digits(int num) {
        String numStr = String.valueOf(num);
        String[] numStrArr = numStr.split("");

        for (int i = 0; i < numStrArr.length; i++) {
            this.digitList.add(Integer.parseInt(numStrArr[i]));
        }
    }

    /**
     * Returns true if the digits in the Digits object are in strictly increasing order.
     * false otherwise.
     *
     * Example 1
     * new Digits(7).isStrictlyIncreasing() -> true
     * new Digits(1345).isStrictlyIncreasing() -> true
     * new Digits(1225).isStrictlyIncreasing() -> true
     * new Digits(32256).isStrictlyIncreasing() -> false
     * new Digits(12658).isStrictlyIncreasing() -> false
     * new Digits(98765).isStrictlyIncreasing() -> false
     *
     */
    public boolean isStrictlyIncreasing() {
        

        return true;
    }
}
