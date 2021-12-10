package agh.ics.oop;

public class World {
    public static void main(String[] args) {
        //System.out.println("SYSTEM WYSTARTOWAL");
        //
        //run(change(argumenty));
        //System.out.println();
        //System.out.println("SYSTEM ZAKONCZYL DZIALANIE");
        //Vector2d position1 = new Vector2d(1,2);
        //System.out.println(position1);
        //Vector2d position2 = new Vector2d(-2,1);
        //System.out.println(position2);
        //System.out.println(position1.add(position2));
        Animal zwierz = new Animal();
        String[] argumenty = {"r","l","b","f"};
        MoveDirection[] directions = OptionsParser.parse(argumenty);
        for (MoveDirection dir:directions) {
            zwierz.move(dir);
            System.out.println(zwierz);

        }
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
