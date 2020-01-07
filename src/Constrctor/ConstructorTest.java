package Constrctor;

public class ConstructorTest {
    ConstructorTest(){
        System.out.println("default constructor");
    }
    void ConstructorTest(){
        System.out.println("This with void retrun type");
    }

    ConstructorTest(int a, int b)
    {
        int test = new Integer(a);
        int test2 = new Integer(b);
    }

    public static void main(String[] args) {
         ConstructorTest constructorTest =new ConstructorTest();
         System.out.println(constructorTest.toString());
        ConstructorTest constructorTest2 =new ConstructorTest(25, 30);
        System.out.println(constructorTest2.toString());

    }
}
