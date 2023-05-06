package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("cuatro");
        list.add("cinco");

        System.out.println("Array list before swap: ");
        for (String a: list){
            System.out.println(a);
        }
        System.out.println();

        Collections.swap(list, 0, 2);
        System.out.println("Array list after swap: ");
        for (String b: list){
            System.out.println(b);
        }

    }
}
