package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("red");
        stringList.add("yellow");
        stringList.add("green");
        stringList.add("blue");
        stringList.add("black");
        System.out.println("List of elements:\n" + stringList);

        stringList.remove(3);
        System.out.println("List of elements after removing third element from the list:\n" + stringList);
    }
}
