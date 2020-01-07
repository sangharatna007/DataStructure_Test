package collectionframe.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContainsArray {

    public static void main(String[] args) {
        String[] fruits = new String[]{"apple", "Banana", "Mango", "test"};

        System.out.println(Arrays.asList(fruits).contains("test"));
        System.out.println(Arrays.asList(fruits).indexOf("test"));

        // Java 8 Stream contains an element

        Boolean result = Arrays.asList(fruits).stream().anyMatch(x-> x.equalsIgnoreCase("apple"));
        System.out.println(result);

        Boolean result1 = Arrays.asList(fruits).stream().anyMatch(x-> x.equalsIgnoreCase("tommato"));
        System.out.println(result1);


    }
}
