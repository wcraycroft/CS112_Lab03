/* StackEmptyException.java
 * Author:  William Craycroft
 * Module:  4
 * Project: Lab 4, Project #2
 * Description: This exception class will return an error message warning that the PersonStack object is empty.
 *
 *       Constructors:
 *           Default constructor - displays a default stack empty error message.
 *           Parameterized constructor - takes in a error message to be displayed (String).
 */

public class StackEmptyException extends RuntimeException {

    // Default constructor - default stack empty error message
    public StackEmptyException () {
        super("PersonStack is empty - no object to return");
    }

    // Parameterized constructor - takes in error message to be displayed as String parameter
    public StackEmptyException(String message) {
        super(message);
    }
}


