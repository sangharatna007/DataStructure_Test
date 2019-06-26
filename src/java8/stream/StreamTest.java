package java8.stream;

import java.util.List;
import java.util.stream.Stream;


public class StreamTest {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("Sangha", "Mangesh", "Govind", "Santosh", "Test");

        list.filter(s -> s.startsWith("M")).forEach(System.out::println);
    }
}
