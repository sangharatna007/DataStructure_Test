package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class SortingOpertation {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Sorting the names according to natural order

//        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted((String s1, String s2)-> s1.length() - s2.length()).forEach(System.out::println);

    }
}
