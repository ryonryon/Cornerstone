package week3.inclass;

public class ArrayExample {
    public static void main(String[] args) {
        int[] ages = {17, 18, 19,20};

        System.out.println(ages);

        // ２Dimensional arrays (2D arrays)
        String[][] students = {{"Ronan", "Brazil"}, {"Jasper", "China"}, {"Ryo", "Japan"}};

        for(int row = 0; row < students.length; row++) {
            for(int col = 0; col < students[row].length; col++) {
                System.out.println(students[row][col]);
            }
        }

    }
}