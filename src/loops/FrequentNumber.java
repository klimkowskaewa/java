package loops;

public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[100];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }
        System.out.print("The most frequent number is: " + mostFrequent);
        System.out.println(", it occurred " + counters[mostFrequent] + " times.");
    }
}