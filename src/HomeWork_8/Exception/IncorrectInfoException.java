package HomeWork_8.Exception;

public class IncorrectInfoException extends Exception {


    public IncorrectInfoException() {
    }

    public IncorrectInfoException(String message) {
        super(message);
    }

    public IncorrectInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectInfoException(Throwable cause) {
        super(cause);
    }

    public IncorrectInfoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
