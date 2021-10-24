package agh.ics.oop;

public enum Direction {
    FORWARD,
    BACKWARD,
    LEFT,
    RIGHT;

    public static Direction change(String drct) {
        switch (drct) {
            case "f":
                return Direction.FORWARD;
            case "b":
                return Direction.BACKWARD;
            case "r":
                return Direction.RIGHT;
            case "l":
                return Direction.LEFT;
            default:
                return null;
        }
    }
}