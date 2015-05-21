package builder;

import domain.Coordinate;
import domain.Shape;

/**
 * Created by david on 5/21/15.
 */
public abstract class ShapeBuilder {
    protected Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void createShape() {
        this.shape = new Shape();
    }

    public void generateCoordinates() {}

    public void generateRadius() {}
}
