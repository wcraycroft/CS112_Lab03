/* TornadoExceptionDemo.java
 * Authors: William Craycroft
 * Module:  4
 * Project: Lab 4, Project #1
 * Problem Statement: This class tests the functionality of the TornadoException class.
 *
 * Algorithm / Plan:
 *      1. Declare distance in miles (int)
 *      2. Throw new TornadoException with no parameters.
 *      3. Catch TornadoException, print getMessage() String.
 *      4. Throw new TornadoException with distance parameter.
 *      5. Repeat step 3.
 */

public class TornadoExceptionDemo {

    public static void main(String[] args) {

        // Declarations
        int distance = 3;

        // Throw default warning message
        try {
            throw new TornadoException();
        } catch (TornadoException e) {
            System.err.println(e.getMessage());
        }

        // Throw parameterized warning message
        try {
            throw new TornadoException(distance);
        } catch (TornadoException e) {
            System.err.println(e.getMessage());
        }
    }
}
