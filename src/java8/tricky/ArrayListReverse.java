package java8.tricky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Tets");
        list.add("Tet");
        list.add("Tes");
        list.add("Tet33s");

        // Reverse the ArrayList using Collections utility class
        Collections.reverse(list);
        for (String str: list
             ) {
            System.out.println(str );

        }
//        System.out.println(list);
    }
}
