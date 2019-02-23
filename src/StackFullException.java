public class StackFullException extends RuntimeException {

    public StackFullException() {
        super("PersonStack is full - object not added");
    }
}
