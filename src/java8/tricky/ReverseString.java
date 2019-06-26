package java8.tricky;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Sangharatna";

        // Using StringBuffer Function
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse() + " Using reverse function");

        // Using charArray

        char[] charArray = str.toCharArray();
       for(int i = charArray.length - 1; i >=0; i--)
       {
           System.out.println(charArray[i]);
       }

        System.out.println(recursiveMethod(str));

    }
    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
