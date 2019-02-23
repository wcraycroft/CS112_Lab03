public class StackEmptyException extends RuntimeException {

    public StackEmptyException () {
        super("PersonStack is empty - no object to return");
    }
}
