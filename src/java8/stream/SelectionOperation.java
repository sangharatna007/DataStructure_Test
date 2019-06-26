package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class SelectionOperation {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.stream().filter((String name) -> name.length() < 5).forEach(System.out::println);


        List<String> test = new ArrayList<>();

        test.add("Test1");
        test.add("Test4");
        test.add("Test5");
        test.add("Test1");
        test.add("Test4");
        test.add("Test1");
        test.stream().distinct().forEach(System.out::println);

    }
}
