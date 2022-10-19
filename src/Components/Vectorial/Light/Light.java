package Components.Vectorial.Light;

import Components.Primitive.Point;
import Components.Vectorial.Vectorial;
import Components.Vectorial.Direction;

public class Light extends Vectorial {
    private Color color;
    private float brightness;

    public Light(Point location, Direction direction, Color color, float brightness) {
        super(location, direction);
        this.color = color;
        this.brightness = brightness;
    }

    public void changeColor(Color color){
        this.color = color;
    }

    public void changeBrightness(float brightness){
        this.brightness = brightness;
    }
}
