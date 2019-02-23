public class MyException extends Exception {

    public MyException() {
        super("Index out of bounds");
    }

    public MyException(int index) {
        super(String.format("Index %d is out of bounds", index));
    }
}
