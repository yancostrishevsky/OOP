package agh.ics.oop;

public class World {
    public static void main(String[] args) {
        System.out.println("SYSTEM WYSTARTOWAL");
        String[] argumenty = {"r","l","b","f"};
        run(change(argumenty));
        System.out.println();
        System.out.println("SYSTEM ZAKONCZYL DZIALANIE");
    }


    public static Direction[] change(String[]  args){
        int size = args.length;
        int ctr = 0;
        Direction[] enarr = new Direction[size];
        for(String text: args){
            enarr[ctr] = Direction.change(text);
            ctr++;
        }
        return enarr;
    }


    public static void run(Direction[] args){
        for(Direction text: args){
            String message = switch(text) {
                case FORWARD -> "Do przodu ";
                case BACKWARD -> "Do tyłu ";
                case RIGHT -> "W prawo ";
                case LEFT -> "W lewo ";
                default -> "Nieznana komenda ";
            };
            System.out.print(message);
        }

    }
}
