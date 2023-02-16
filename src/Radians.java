/**
 *
 * @author Trevor Hartman
 * @author Brandin Crockett
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        return degrees * Math.PI / 180.0;
    }

    public static double toDegrees(double radians) {
        return radians * 180.0 /Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        double radians = toRadians(degrees);
        double radiansCheck = Math.toRadians(degrees);
        System.out.printf("%f degrees = %f radians (Non-math)%n", degrees, radians);
        System.out.printf("%f degrees = %f radians (Math method)%n", degrees, radiansCheck);

        System.out.print("Type radians you'd like converted to degrees: ");
        radians = Double.valueOf(scanner.nextLine());
        degrees = toDegrees(radians);
        double degreesCheck = Math.toDegrees(radians);
        System.out.printf("%f radians = %f degrees (using non-Math method)%n", radians, degrees);
        System.out.printf("%f radians = %f degrees (using Math.toDegrees)%n", radians, degreesCheck);
    }
}
