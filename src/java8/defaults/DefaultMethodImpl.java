package java8.defaults;

public class DefaultMethodImpl implements DefaultMethod {

    @Override
    public void method1() {
        System.out.println("This is the method1");
    }

    @Override
    public void method() {
        System.out.println("this is call from method");
    }

}
