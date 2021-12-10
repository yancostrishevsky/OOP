package agh.ics.oop;

public class OptionsParser {
    public static MoveDirection[] parse(String[] args)
    {
        MoveDirection[] directions = new MoveDirection[args.length];
        int c = 0;
        for (String arg:args)
        {
            switch (arg)
            {
                case "f","forward":
                    directions[c++] = MoveDirection.FORWARD;
                    break;

                    case "b","backward":
                        directions[c++] = MoveDirection.BACKWARD;
                        break;

                case "l", "left":
                    directions[c++] = MoveDirection.LEFT;
                    break;

                case "r","right":
                    directions[c++] = MoveDirection.RIGHT;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + arg);
            }
        }
        return directions;
    }
}
