import java.util.Scanner;

/**
* The program asks the user for the radius of a sphere.
* It then tells the user the volume.
*
* @author  Ms Raffin
* @version 1.0
* @since   2023-02-10
*/

public final class ConsoleInput {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private ConsoleInput() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to Ms Raffin's Sphere program!");
        System.out.print("Enter the radius of the sphere (cm): ");

        // Using Scanner for Getting Input from User
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double radDouble = Double.parseDouble(radString);

            if (radDouble < 0) {
                System.out.println("The radius cannot be negative.");
            } else {
                // Calculate the volume
                final double volume = 4.0 / 3.0 * Math.PI
                    * Math.pow(radDouble, 3);

                // Display the volume, rounded to 2 decimal places
                System.out.print("The volume of the sphere with radius, ");
                System.out.print(radString + "cm, is ");
                System.out.format("%.2f", volume);
                System.out.println("cm^3.");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Your input was invalid. "
                    + exception.getMessage());
        }
        // Closing Scanner
        scanner.close();
    }
}

