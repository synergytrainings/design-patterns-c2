import builder.CircleBuilder;
import builder.RectangleBuilder;
import dirrector.Drawer;
import domain.Shape;

/**
 * Created by david on 5/21/15.
 */
public class Main {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();

        Shape rect = drawer.getShapeFrom(new RectangleBuilder());
        Shape circ = drawer.getShapeFrom(new CircleBuilder());

        System.out.println("Rectangle:");
        rect.getShapeDetails();

        System.out.println("Circle:");
        circ.getShapeDetails();
    }
}
