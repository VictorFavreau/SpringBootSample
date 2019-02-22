package sample.utils;

public class Result<T> {
    private final boolean success;
    private final T data;
    private final Message message;

    public Result(boolean success, T data, Message message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Result(boolean success, T data) {
        this(success, data, null);
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @return the message
     */
    public Message getMessage() {
        return message;
    }

    public static Result createSuccess(Object data) {
        return new Result(true, data);
    }

    /**
     * Encapsule le message de la répponse
     */
    public static class Message {

        private final MessageType type;
        private final String message;

        public Message(MessageType type, String message) {
            this.type = type;
            this.message = message;
        }

        public MessageType getType() {
            return type;
        }

        public String getMessage() {
            return message;
        }
    }

    /**
     * Énumère les types de message
     */
    public enum MessageType {

        FUNCTIONAL("functional"),
        TECHNICAL("technical");

        private final String type;

        private MessageType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }
}
