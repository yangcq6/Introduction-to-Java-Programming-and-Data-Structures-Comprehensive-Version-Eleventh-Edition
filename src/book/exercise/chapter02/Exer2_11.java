package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int year = input.nextInt();

        // 每年的人数：上一年人数 + t / 7.0 - t / 13.0 + t / 45.0
        int t = year * 365 * 24 * 60 * 60;
        int now = 312032486;

        int birth = t / 7;
        int death = t / 13;
        int immigration = t / 45;

        int sum = now + birth - death + immigration;

        System.out.println("The population in " + year + " years is " + sum);

    }
}
