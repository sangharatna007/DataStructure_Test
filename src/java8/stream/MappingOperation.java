package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MappingOperation {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.stream().map(String :: length).forEach(System.out::println);
    }
}
