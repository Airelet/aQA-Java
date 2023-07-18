package homework15.exceptions;

public class WrongPasswordException extends Throwable {

    public WrongPasswordException(String errorMessage) {
        super(errorMessage);
    }

    public WrongPasswordException() {
        super();
    }
}
