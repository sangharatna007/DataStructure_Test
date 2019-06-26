package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Test1");
        strings.add("Test2");
        strings.add("Test3");
        strings.add("Test4");
        strings.add("Test5");
        strings.add("Test6");

        System.out.println("This is simple for each");
        strings.forEach(p-> System.out.println(p));


        strings.forEach(p->{
            if("Test1".equals(p)){
                System.out.println("Got it");
            }
            else {
                System.out.println("Not got");
            }
        });

        strings.stream().filter(p->p.contains("Test1")).forEach(System.out::println);


        Map<Integer, String>  map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        map.forEach((k,v)-> System.out.println("Key" + k + "Item" + v));
        map.forEach((k,v)->{
            System.out.println("Key" + k + "Value" + v);
            if("B".contains(v))
                System.out.println("B is Present in Stream");
        });
    }
}
