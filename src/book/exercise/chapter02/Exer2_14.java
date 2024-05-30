package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilo = weightInPounds * 0.45359237;
        double heightInMile = heightInInches * 0.0254;

        double bmi = weightInKilo / (heightInMile * heightInMile);

        System.out.println("BMI is " + bmi);

    }
}
