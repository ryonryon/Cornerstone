package week2.ifstatements;

import java.util.Scanner;

public class BMICategories{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.printf("Your height in m: ");
        double height = scn.nextDouble();

        System.out.printf("Your weight in kg: ");
        double weight = scn.nextDouble();

        double bmi = weight / height * height;

        String bmiCategory = "";

        if(bmi < 15.0) {
            bmiCategory = "very severely underweight";
        } else if(15.0 <= bmi && bmi <= 16.0) {
            bmiCategory = "severely underweight";
        } else if(16.1 <= bmi && bmi <= 18.4) {
            bmiCategory = "underweight";
        } else if(18.5 <= bmi && bmi <= 24.9) {
            bmiCategory = "normal weight";
        } else if(25.0 <= bmi && bmi <= 29.9) {
            bmiCategory = "overweight";
        } else if(30.0 <= bmi && bmi <= 34.9) {
            bmiCategory = "moderately obese";
        } else if(35.0 <= bmi && bmi <= 39.9) {
            bmiCategory = "severely obese";
        } else if(40.0 <= bmi) {
            bmiCategory = "very severely (or \"morbidly\") obese";
        }

        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scn.close();
    }
}