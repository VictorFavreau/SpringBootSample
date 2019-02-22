package sample.exceptions;

public class DaoException extends AbstractServiceException {
    
    public DaoException(
            String code, 
            String messageKey,
            Object... parameters) {
        super(code, messageKey, parameters);
    }
    
    public DaoException(
            DaoExceptionEnum daoExceptionEnum,
            Object... parameters) {
        super(daoExceptionEnum.getCode(), daoExceptionEnum.getMessageKey(), parameters);
    }

    public DaoException(
            Throwable cause,
            String code,
            String messageKey,
            Object... parameters) {
        super(cause, code, messageKey, parameters);
    }
}
