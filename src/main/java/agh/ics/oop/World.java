package agh.ics.oop;

public class World {
    public static void main(String[] args) {
       

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
                case FORWARD -> "forward ";
                case BACKWARD -> "bacward ";
                case RIGHT -> "right ";
                case LEFT -> "left ";
                default -> "unknown command ";
            };
            System.out.print(message);
        }

    }



}
