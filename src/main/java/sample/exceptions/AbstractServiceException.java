package sample.exceptions;

public abstract class AbstractServiceException extends Exception {

    private final String code;
    private final String messageKey;
    private final Object[] parameters;
    
    protected AbstractServiceException(
            String code, 
            String messageKey,
            Object... parameters) {
        super(messageKey);
        this.code = code;
        this.messageKey = messageKey;
        this.parameters = parameters;
    }

    protected AbstractServiceException(
            Throwable cause,
            String code, 
            String messageKey,
            Object... parameters) {
        super(messageKey, cause);
        this.code = code;
        this.messageKey = messageKey;
        this.parameters = parameters;
    }

    @Override
    public String getLocalizedMessage() {
        return this.messageKey;
    }

    public final String getCode() {
        return code;
    }

    public final String getMessageKey() {
        return messageKey;
    }

    public final Object[] getParameters() {
        return parameters;
    }
}
