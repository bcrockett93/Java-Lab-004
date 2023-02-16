/**
 *
 * @author Trevor Hartman
 * @author Brandin Crockett
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int number) {
        int result = number * number;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int result = square(number);
        System.out.println("The square of " + number + " is " + result);
    }
}
