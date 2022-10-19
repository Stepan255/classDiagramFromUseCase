package Components.Vectorial;

import Components.Primitive.Point;

public abstract class Vectorial {
    private Point location;
    private Direction direction;

    protected Vectorial(Point location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public void move(Point location){
        this.location = location;
    }

    public void rotate(Direction direction){
        this.direction = direction;
    }
}
