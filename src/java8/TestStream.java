package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream
{
    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();
        str.add("test1");
        Stream<String> stringStream = Stream.of("Test1", "Test2", "Test3", "Test4");
        stringStream.forEach(p-> System.out.println(p));

    }



}
