package java8.collections;

import java.util.HashMap;
import java.util.Map;

public class ForEachToMap {
    public static void main(String[] args) {

        Map<String , Integer> items = new HashMap<>();
        items.put("A", 201);
        items.put("B", 202);
        items.put("C", 203);
        items.put("D", 204);
        items.put("E", 205);

        for(Map.Entry<String , Integer> entry : items.entrySet())
        {
            System.out.println(entry.getKey() +" "+"Value Is" + " "+ entry.getValue());
        }

        System.out.println("Using Java 8");
//        items.forEach((k,v)-> System.out.println("Key" + k + "Value " + v));
        items.forEach((k, v)->{
            System.out.println("Key" + k + "Val");
            if("D".equals(k))
                System.out.println("This is danger for Us");
        });

        System.out.println("Another way we can write the code");


    }
}
