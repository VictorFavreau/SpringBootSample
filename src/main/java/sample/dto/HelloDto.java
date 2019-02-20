package sample.dto;

public class HelloDto {

    private final String message;

    public HelloDto() {
        this.message = null;
    }

    public HelloDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}