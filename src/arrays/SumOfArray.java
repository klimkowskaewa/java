package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int array[] = {0,2,4,6,8,10,13,18};
        int sum = 0;

        for (int i : array)
            sum +=i;
        System.out.println("The sum is: " + sum);
    }
}