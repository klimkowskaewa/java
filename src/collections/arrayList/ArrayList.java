package collections.arrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(3);
        numbers.add(343);
        numbers.add(7);

//        Integer[] array = new Integer[numbers.size()];
//        array = numbers.toArray(array);

        Integer[] array = numbers.toArray(new Integer[numbers.size()]);

        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println();

        List<Integer> list = new java.util.ArrayList<>();
        list.addAll(numbers);
        list.addAll(numbers);
        list.addAll(numbers);

        System.out.println(list);
        System.out.println(list.lastIndexOf(343));

        list.set(7, 999);
        System.out.println(list);

        list.set(list.lastIndexOf(343), 999);
        System.out.println(list);
    }

}