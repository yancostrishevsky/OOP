package agh.ics.oop;

public class Animal {
    private MapDirection direction = MapDirection.NORTH;
    private Vector2d possition = new Vector2d(2, 2);

    public String toString() {
        switch (direction) {
            case NORTH:
                return "patrzy sie do gory";
            case SOUTH:
                return "patrzy sie w dol";
            case WEST:
                return "patrzy sie w lewo";
            case EAST:
                return "patrzy sie w prawo";
            default:
                throw new IllegalArgumentException("Invalid animal direction");
        }
    }
    public MapDirection getDirection() {
        return direction;
    }


    public Vector2d getPos() {
        return possition;
    }

    public void move(MoveDirection dir) {
        MapDirection firstPos = getDirection();
        switch (dir) {
            case RIGHT:
                this.direction = MapDirection.EAST;
                MapDirection secPos = getDirection();
                if(firstPos==secPos)
                {
                    if(possition.x<4){
                    possition = possition.add(new Vector2d(1,0));
                    }
                }
                return;
            case LEFT:
                this.direction = MapDirection.WEST;
                secPos = getDirection();
                if(firstPos==secPos)
                {
                    if(possition.x>0){
                    possition = possition.add(new Vector2d(-1,0));
                    }
                }
                return;
            case FORWARD:
                this.direction = MapDirection.NORTH;
                secPos = getDirection();
                if(firstPos==secPos)
                {
                    if(possition.y <4){
                    possition = possition.add(new Vector2d(0,1));
                    }
                }
                return;
            case BACKWARD:
                this.direction = MapDirection.SOUTH;
                secPos = getDirection();
                if(firstPos==secPos)
                {
                    if(possition.y>0){
                    possition = possition.add(new Vector2d(-1,0));
                    }
                }
                return;
        }





    }
}