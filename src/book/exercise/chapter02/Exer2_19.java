package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinated of three points separated by spaces" +
                " like x1 y1 x2 y2 x3 y3: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double dx = x1 - x2, dy = y1 - y2;
        double s1 = Math.pow(dx * dx + dy * dy, 0.5);

        dx = x1 - x3;
        dy = y1 - y3;
        double s2 = Math.pow(dx * dx + dy * dy, 0.5);

        dx = x2 - x3;
        dy = y2 - y3;
        double s3 = Math.pow(dx * dx + dy * dy, 0.5);

        double s = (s1 + s2 + s3) / 2;
        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

        System.out.println("The area of the triangle is " + area);
    }
}
