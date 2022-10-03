package day57_exceptions.Fink;

public class FinkException extends RuntimeException { // to create unchecked exception

    public FinkException(String str) {
        super("Run me FinkException ! ");
    }
}
