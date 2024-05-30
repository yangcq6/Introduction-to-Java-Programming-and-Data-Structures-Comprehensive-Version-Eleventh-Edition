package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int totalMinutesOfOneYear = 365 * 24 * 60;

        int year = minutes / totalMinutesOfOneYear;
        int remainingMinutes = minutes % totalMinutesOfOneYear;
        int day = remainingMinutes / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + year
                + " years and " + day + " days");
    }
}
