package java8;

import jdk.nashorn.internal.objects.annotations.Function;
import sun.security.pkcs11.wrapper.Functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(
                java.util.function.Function.identity(), Collectors.counting()
        ));

        System.out.println(result);
    }
}
