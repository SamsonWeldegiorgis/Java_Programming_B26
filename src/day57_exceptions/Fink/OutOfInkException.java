package day57_exceptions.Fink;

public class OutOfInkException extends RuntimeException {
    public OutOfInkException(String message) {
        super(message);
    }
}
