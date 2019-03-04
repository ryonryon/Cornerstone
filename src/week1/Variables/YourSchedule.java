package week1.variables;

public class YourSchedule{
    public static void main(String[] args) {
        
        String classAndTeacherList[][] = {
            {"ESL5.0", "Chad"},
            {"ESL6.0", "Arareh"},
            {"ESL6.5", "Abasu"},
            {"Web & Mobile Dev", "Derrick"}
        };

        for(int i = 0; i <= classAndTeacherList.length - 1; i++) {
            System.out.println(classAndTeacherList[i][0] + " : " +classAndTeacherList[i][1]);
        }
    }
}