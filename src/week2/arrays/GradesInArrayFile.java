package week2.arrays;

import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class GradesInArrayFile {
    public static void main(String[] args) {
        
        System.out.printf("Name (first last): ");
        String name = System.console().readLine();
        
        System.out.printf("File name: ");
        String fileName = System.console().readLine();

        System.out.println("Here are your randomly-selected grades (hope you pass):");

        Random random = new Random();
        int[] rdmArray = new int[5];
        
        for(int i = 0; i < rdmArray.length; i++) {
            rdmArray[i] = random.nextInt(50 + 1);
            System.out.printf("Grade %s: %s\n", i, rdmArray[i]);
        }

        try {
            
            FileWriter fw = new FileWriter(fileName, true);
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));


            pw.println(name);
            
            for(int j: rdmArray) {
                pw.printf(j+ " ");
            }

            pw.close();

        } catch(IOException e) {
            System.out.println("something goes wrong.");
        }

        System.out.printf("Data saved in \"%s\".\n", fileName);
    }
}