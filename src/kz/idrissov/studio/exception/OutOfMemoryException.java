package kz.idrissov.studio.exception;

public class OutOfMemoryException extends Exception{
    public OutOfMemoryException() {
    }

    public OutOfMemoryException(String message) {
        super(message);
    }

    public OutOfMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfMemoryException(Throwable cause) {
        super(cause);
    }
}
