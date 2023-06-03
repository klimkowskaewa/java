package math;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        int number = 1234;
        int positive = 1;
        if (number < 0 ) {
            positive = -1;
            number = -1 * number;
        }

        int sum = 0;
        while (number > 0) {
            int x = number % 10;

            int maxDiff = Integer.MAX_VALUE - sum * 10;
            if (sum > Integer.MAX_VALUE / 10 || x > maxDiff)
                System.out.println("Wrong number!");
            sum = sum * 10 + x;
            number /= 10;
        }

        System.out.println(positive * sum);
    }
}