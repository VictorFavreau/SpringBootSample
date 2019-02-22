package sample.exceptions;

public enum DaoExceptionEnum {

    DAO_UPDATE("DA-E-0001", "Unable to update DataBase."), 
    DAO_READ("DA-E-0002", "Unable to read DataBase."),
    DAO_SESSION_FACTORY("DA-E-0004", "Unable to access DataBase management."),
    DAO_SESSION("DA-E-OOO5", "Unable to access DataBase connection"), 
    DAO_CLASS("DA-E-0006", "Unable to access DataBase Object");

    private final String code;
    private final String messageKey;

    DaoExceptionEnum(String code, String messageKey) {
        this.code = code;
        this.messageKey = messageKey;
    }

    public String getCode() {
        return code;
    }

    public String getMessageKey() {
        return messageKey;
    }
}
