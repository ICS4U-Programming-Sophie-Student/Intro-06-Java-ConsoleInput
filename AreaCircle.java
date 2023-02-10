import java.util.Scanner;

/**
* The program asks the user for the radius of a circle.
* It then tells the user the area.
*
* @author  Ms Raffin
* @version 1.0
* @since   2023-02-10
*/

public final class AreaCircle {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private AreaCircle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to Ms Raffin's Area of Circle program!");
        System.out.print("Enter the radius of the circle (cm): ");

        // Using Scanner for Getting Input from User
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // Convert the string to a double
        final double radDouble = Double.parseDouble(radString);

        // If radius is negative, tell the user
        if (radDouble < 0) {
            System.out.println("The radius cannot be negative.");
        } else {
            // Calculate the area
            final double area = Math.PI * Math.pow(radDouble, 2);

            // Display the volume, rounded to 2 decimal places
            System.out.print("The area of a circle with radius, ");
            System.out.print(radString + "cm, is ");
            System.out.format("%.2f", area);
            System.out.println("cm^2.");
        }

        // Closing Scanner
        scanner.close();
    }
}

