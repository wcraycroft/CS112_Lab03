/* TornadoException.java
 * Author:  William Craycroft
 * Module:  4
 * Project: Lab 4, Project #1
 * Description: This exception class will display a warning message for an incoming tornado.
 *
 *       Constructors:
 *           Default constructor - displays a default tornado warning message.
 *           Parameterized constructor - takes in distance from tornado in miles (int). Displays warning message
 *               with distance.
 */

public class TornadoException extends Exception {

    // Default constructor - displays a default tornado warning message.
    public TornadoException() {
        super("Tornado! Take cover immediately!");
    }

    // Parameterized constructor - takes in number of miles as integer and displays a warning message with distance.
    public TornadoException (int m) {
        super(String.format("Tornado is %d miles away and approaching fast!", m));
    }
}
