package book.exercise.chapter01;

/**
 * 2024/05/28
 *
 * @author yangcq6
 */
public class Exer1_11 {
    public static void main(String[] args) {
        // 1年的时间：t = (365 * 24 * 60) s
        // 每年的人数：上一年人数 + t / 7.0 - t / 13.0 + t / 45.0
        int t = 365 * 24 * 60 * 60;
        int now = 312032486;

        // 小数应该不算一个人 吧? 就用整除
        int nums = now + t / 7 - t / 13 + t / 45;
        System.out.print("1 year: ");
        System.out.println(nums);

        nums = nums + t / 7 - t / 13 + t / 45;
        System.out.print("2 year: ");
        System.out.println(nums);

        nums = nums + t / 7 - t / 13 + t / 45;
        System.out.print("3 year: ");
        System.out.println(nums);

        nums = nums + t / 7 - t / 13 + t / 45;
        System.out.print("4 year: ");
        System.out.println(nums);

        nums = nums + t / 7 - t / 13 + t / 45;
        System.out.print("5 year: ");
        System.out.println(nums);
    }
}
