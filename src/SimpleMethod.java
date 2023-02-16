/**
 *
 * @author Trevor Hartman
 * @author Brandin Crockett
 *
 * @since Version 1.0
 *
 */
public class SimpleMethod {
    // Put your method code here
    static void square (int number) {
        int result = number * number;
        System.out.println("The square of " + number + " is " + result);
    }

    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
