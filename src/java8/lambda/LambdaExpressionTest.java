package java8.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressionTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(201, "Test1");
        map.put(202, "BNY");
        map.put(203, "Yash");

        for(Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "Key" + "Value" + entry.getValue());

        System.out.println("Java 8 Can triverse like this");
        map.forEach((k, v)-> System.out.println("Key" + k + "Value" + v));

    }
}
