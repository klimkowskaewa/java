package arrays;

public class ArrayFiller {

    public static void main(String[] args) {
        int arrSize = 5;

        int[] arr = new int[arrSize];

        fill(arr);
        show(arr);
        revers(arr);
        show(arr);
    }

    static void show(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != (arr.length - 1)) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    static void revers(int[] arr) {
        int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp[arr.length - 1 - i];
        }
    }
}