package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreationOfStream {
    public static void main(String[] args) {
        // Creating Empty Steam,
        Stream<Object> string = Stream.empty();
        System.out.println(string.count());

        // Create element type

        Stream<Object> obj = Stream.of(new Object());
        System.out.println(obj.count());

        // create type value

        Stream<Integer> intValue = Stream.of(2,6,8,9,1,4,7);
        System.out.println(intValue.count());

        // Create string form collection

        List<String> list = new ArrayList<>();
        list.add("Test");
//        list.add("Test2");
//        list.add("Test3");
//        list.add("Test4");

        list.stream().forEach(System.out::println);


        List<String> list2 = new ArrayList<>();
        list2.add("Test");
        list2.add("Sangha");
        list2.add("Brijesh");
        list2.add("Rup");
        list2.add("Test");
        list2.add("Sangha");
        list2.add("Ratna");
        list2.add("Rup");

        list2.stream().skip(3).forEach(System.out::println);
    }
}
