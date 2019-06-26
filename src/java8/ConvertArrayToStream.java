package java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        String[] str = {"Str", "Test", "Python", "Java", "PHP"};

        // Array of Stream
        Stream<String> streams = Arrays.stream(str);
        streams.forEach(System.out::println);

        // Stream of

        System.out.println("===============================");
        Stream<String> rest = Stream.of(str);
        rest.forEach(System.out::println);
    }
}
