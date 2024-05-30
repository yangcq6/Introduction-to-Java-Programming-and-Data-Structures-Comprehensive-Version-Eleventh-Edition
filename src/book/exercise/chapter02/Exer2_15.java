package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();;
        double y1 = input.nextDouble();;
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();;
        double y2 = input.nextDouble();;

        double dx = x1 - x2, dy = y1 - y2;
        double distance = Math.pow(dx * dx + dy * dy, 0.5);
        System.out.println("The distance between the to points is" + distance);
    }
}
