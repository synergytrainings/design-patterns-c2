package dirrector;

import builder.ShapeBuilder;
import domain.Shape;

/**
 * Created by david on 5/21/15.
 */
public class Drawer {
    public Shape getShapeFrom(ShapeBuilder builder) {
        builder.createShape();
        builder.generateCoordinates();
        builder.generateRadius();
        return builder.getShape();
    }
}
