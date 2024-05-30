package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();

        double area = 3 * Math.pow(3, 0.5) * length * length / 2;

        System.out.println("The area of the hexagon is " + area);

    }
}
