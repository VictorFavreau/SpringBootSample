package sample.utils;

public class SortParameter {
    
    private String property;
    private Direction direction;

    public SortParameter() {
    }

    public SortParameter(String property, Direction direction) {
        this.property = property;
        this.direction = direction;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public enum Direction {
        ASC, DESC
    }
}
