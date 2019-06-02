package kz.idrissov.studio.exception;

public class ReRecordingException extends Exception{
    public ReRecordingException() {
    }

    public ReRecordingException(String message) {
        super(message);
    }

    public ReRecordingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReRecordingException(Throwable cause) {
        super(cause);
    }
}
