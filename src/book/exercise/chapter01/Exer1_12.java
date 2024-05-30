package book.exercise.chapter01;

/**
 * 2024/05/29
 *
 * @author yangcq6
 */
public class Exer1_12 {
    public static void main(String[] args) {
        // 1h40m35s = (100 + (35.0 / 60)) / 60 h
        // 24英里 = 24 * 1.6 km
        double time = (100 + (35.0 / 60)) / 60;
        double distance = 24 * 1.6;

        System.out.print("result is ");
        System.out.println(distance / time);
    }
}
