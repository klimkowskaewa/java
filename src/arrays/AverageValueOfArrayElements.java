package arrays;

public class AverageValueOfArrayElements {
    public static void main(String[] args) {

        int[] numbers = new int[] {-150,-55,-33,-25,-5,5,55,155};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = sum/ numbers.length;
        System.out.println("Average value of the array element is: " + average);
    }
}