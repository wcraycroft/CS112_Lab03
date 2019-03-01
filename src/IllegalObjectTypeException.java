/* IllegalObjectTypeException.java
 * Author:  William Craycroft
 * Module:  4
 * Project: Lab 4, Project #2
 * Description: This exception class will return an error message pertaining to an illegal object type being sent to the
 *              PersonStack class.
 *
 *       Constructors:
 *           Default constructor - displays a default illegal object error message.
 *           Parameterized constructor - takes in a error message to be displayed (String).
 */

public class IllegalObjectTypeException extends Exception {

    // Default constructor - default illegal object error message
    public IllegalObjectTypeException() {
        super("Object is not a Person - object not pushed.");
    }

    // Parameterized constructor - takes in error message to be displayed as String parameter
    public IllegalObjectTypeException(String message) {
        super(message);
    }
}
