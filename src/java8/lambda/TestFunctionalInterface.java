package java8.lambda;

public class TestFunctionalInterface  implements  TestFunctionalInverface{
    public static void main(String[] args) {
        TestFunctionalInterface testFunctionalInterface = new TestFunctionalInterface();
        testFunctionalInterface.method();

        int [] intArray = {2, 3, 5};

        for(int i = 0; i > intArray.length -1 ; i--)
        {
            System.out.println(i);
        }

    }

    @Override
    public void method() {
        System.out.println("This is implementation method");
    }
}
