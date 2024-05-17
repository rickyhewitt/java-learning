/*
    pi-to-nth-places

    Example program for outputting pi, with a limit
    supplied by the user.

    ricky@rickyhewitt.dev
 */
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Initialize variable for storing user input (int)
        int limit = 0;

        // Program output
        System.out.println("pi-to-nth-digit \n");
        System.out.println("How many digits of pi would you like?");
        System.out.println("Digits: ");

        // Attempt to store user input into the limit var.
        try {
            limit = keyboard.nextInt();
        }
        // Invalid data type
        catch (java.util.InputMismatchException e) {
            // Display human error
            System.out.println("\nError: Please enter a valid number");
            // Quit (with non-success error code)
            System.exit(0);
        }
        // Unknown error
        catch (Exception e) {
            // Display exception output
            System.out.println(e.toString());
        }

        // Set the precision to the requested decimal places
        MathContext mc = new MathContext(limit);

        // Use the value of PI from the Math class
        BigDecimal pi = new BigDecimal(Math.PI, mc);

        // Print the value of pi
        System.out.println(pi);
    }
}