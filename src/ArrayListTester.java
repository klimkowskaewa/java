import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTester {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(123);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println();

        numbers.remove(0);
        System.out.println(numbers);
        System.out.println();

        numbers.remove((Integer) 123);
        System.out.println(numbers);
        System.out.println();

        numbers.clear();
        System.out.println(numbers);
        System.out.println();


        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Staszek");
        names.add("Kasia");
        names.add("Wiola");
        names.add("Marta");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }

        names.remove("Staszek");
        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }
        System.out.println();

        List list = new ArrayList<>();
        list.add(1);
        list.add("seven");
        list.add(new Object());

        System.out.println(list);
        System.out.println(1 + "seven");
        System.out.println((int) list.get(0) + (String) list.get(1));
        System.out.println();

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(2);
        numbers2.add(2);
        numbers2.add(20);
        numbers2.add(6);
        numbers2.add(123);
        numbers2.add(99);
        numbers2.add(33);
        numbers2.add(200);

        System.out.println("All elements: ");
        System.out.println(numbers2);
        System.out.println("After removing the odd numbers: ");

        Iterator<Integer> iterator = numbers2.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers2);
    }
}
