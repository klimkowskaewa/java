package arrays;

import java.util.Arrays;

public class MaximumDifferenceBetweenElements {
    public static int difference(int[] numbers) {
        int difference = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length ; j++) {
                difference = Integer.max(difference,numbers[j]-numbers[i]);
            }
        }
        return difference;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 99, -5, 100};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("The maximum difference between two elements of the array elements: " + difference(numbers) );
    }
}
