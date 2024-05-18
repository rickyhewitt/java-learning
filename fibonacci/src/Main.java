/*
fibonacci
An example of generating the fibonacci sequence

The fibonacci sequence is a series of numbers
The next number is found by adding up the two numbers before it.

ricky@rickyhewitt.dev
 */
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Define limit
        var LIMIT = 50;

        // Initialize an array, which will store ALL numbers.
        // Note: It would be more efficient if I only stored the two prior numbers,
        //       but this will suffice.
        Stack<Long> numbers = new Stack<Long>();

        // Use a string var for output
        // This is to avoid multiple unnecessary calls to System.out.println (expensive).
        String output = "";

        // Begin loop
        for (var i = 0; i < LIMIT; i++) {
            long currentNum;
            if (numbers.size() > 1) {
                currentNum = (numbers.elementAt((i-1)) + numbers.elementAt((i-2)));
            }
            else {
                currentNum = i;
            }

            // Append (push) current number to Stack
            numbers.push(currentNum);
            // Append current number to output
            output = output + currentNum;

            // Add comma to output, as long as we are not on final number
            if (i != (LIMIT-1)) {
                output = output + ", ";
            }
        }

        // Display final output
        System.out.println(output);

    }
}