package exception;

public class ThrowExample {
    static void checkEliglblity(int studage, int studwigt)
    {
        if(studage < 12 && studwigt < 44)
            throw new ArithmeticException("Student not eligible for admmission");
        else
            System.out.println("Valid entry");
    }
    public static void main(String[] args) {
        checkEliglblity(11, 22);

    }
}
