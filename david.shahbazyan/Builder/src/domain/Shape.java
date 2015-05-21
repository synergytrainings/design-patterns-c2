package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 5/21/15.
 */
public class Shape {
    public List<Coordinate> coordinates = new ArrayList<>();
    public Double radius;

    public void getShapeDetails() {
        if (coordinates != null && !coordinates.isEmpty()) {
            System.out.println("Coordinates:");
            for (Coordinate coordinate : coordinates) {
                System.out.println("\t[" + coordinate.x + "," + coordinate.y + "]");
            }
        }
        if (radius != null) {
            System.out.println("Radius: " + radius);
        }
    }
}
