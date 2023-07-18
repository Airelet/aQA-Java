package homework15.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException(String errorMessage) {
        super(errorMessage);
    }

    public WrongLoginException() {
        super();
    }
}
