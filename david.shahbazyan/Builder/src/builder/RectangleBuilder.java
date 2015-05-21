package builder;

import domain.Coordinate;

import java.util.Random;

/**
 * Created by david on 5/21/15.
 */
public class RectangleBuilder extends ShapeBuilder {
    @Override
    public void generateCoordinates() {
        Random random = new Random();
        shape.coordinates.add(new Coordinate(random.nextInt(250), random.nextInt(250)));
        shape.coordinates.add(new Coordinate(random.nextInt(250), random.nextInt(250)));
        shape.coordinates.add(new Coordinate(random.nextInt(250), random.nextInt(250)));
        shape.coordinates.add(new Coordinate(random.nextInt(250), random.nextInt(250)));
    }
}
