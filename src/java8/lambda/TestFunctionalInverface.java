package java8.lambda;
@FunctionalInterface
public interface TestFunctionalInverface {

    abstract void method();
    default void method1(){
        System.out.println("In Functional Interface can no of default method can declare");
    }

}
