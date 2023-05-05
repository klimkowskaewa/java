package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOneArrayListToAnother {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println("List1: " + list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("x");
        list2.add("y");
        list2.add("z");
        System.out.println("List2: " + list2);

        //copy list1 to list2
        Collections.copy(list2, list1);
        System.out.println("List: " + list1);
        System.out.println("List: " + list2);
    }
}
