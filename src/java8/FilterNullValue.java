package java8;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValue {
    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

//        List<String> result = language.collect(Collectors.toList());
//
//        System.out.println("With Null Value");
//        result.forEach(System.out::println);

//        System.out.println("Without Null Value");
//
//        List<String> res = language.filter(p-> p!=null).collect(Collectors.toList());
//
//        res.forEach(System.out::println);

        System.out.println("With using nonNull");

        List<String> stringLis = language.filter(Objects::nonNull).collect(Collectors.toList());
        stringLis.forEach(System.out::println);
    }
}
