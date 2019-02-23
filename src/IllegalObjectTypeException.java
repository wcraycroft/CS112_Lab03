public class IllegalObjectTypeException extends RuntimeException {

    public IllegalObjectTypeException() {
        super("Object is not a Person - object not pushed.");
    }
}
