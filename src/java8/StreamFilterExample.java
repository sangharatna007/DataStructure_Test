package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sangha", "Ratna", "Santosh");

        List<String> result = list.stream().filter(s -> !"Sangha".equals(s))
                                            .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
