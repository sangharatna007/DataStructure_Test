package static_test;

public class StaticTest {
    static int staticVar;
    static {
        System.out.println("This is static component");
        staticVar = 007;
    }

    static void staticMethod()
    {
        System.out.println("This is from static method");
        System.out.println(staticVar);
    }
    public static void main(String[] args) {

    staticMethod();

    }
}
