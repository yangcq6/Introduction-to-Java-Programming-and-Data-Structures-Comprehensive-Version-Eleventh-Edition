package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58℉ and 41℉: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed(>=2) in miles per hour: ");
        double speed = input.nextDouble();

        double res = 35.74 + 0.6215 * temperature -
                35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is " + res);
    }
}
