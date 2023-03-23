import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCompareDemo {
    public static final int MAX_VALUE = 1_000_000;

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        fill(numbers);

        long startTime = System.currentTimeMillis();
        insertInMiddle(numbers);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime + " milliseconds");
    }

    static void fill(List list) {
        for (int i = 1; i < MAX_VALUE; i++) {
            list.add(i);
        }
    }

    static void insertInMiddle(List list) {
        int half = MAX_VALUE/2;
        int part = MAX_VALUE / 10;
        ListIterator iterator = list.listIterator(half);
        for (int i = 1; i < part ; i++) {
            iterator.add(0);
        }
    }

}