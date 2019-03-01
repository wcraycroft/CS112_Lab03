/* StackFullException.java
 * Author:  William Craycroft
 * Module:  4
 * Project: Lab 4, Project #2
 * Description: This exception class will return an error message warning that the PersonStack object is full.
 *
 *       Constructors:
 *           Default constructor - displays a default stack full error message.
 *           Parameterized constructor - takes in a error message to be displayed (String).
 */

public class StackFullException extends Exception {

    // Default constructor - default stack full error message
    public StackFullException() {
        super("PersonStack is full - object not added");
    }

    // Parameterized constructor - takes in error message to be displayed as String parameter
    public StackFullException(String message) {
        super(message);
    }
}
