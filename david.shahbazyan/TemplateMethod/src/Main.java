import api.ShapeDrawer;
import enums.Shape;
import impl.CircleDrawer;
import impl.TriangleDrawer;

/**
 * Author: David.Shahbazyan Created: Mar 25, 2016
 */
public class Main {
	public static void main(String[] args) {
		final Shape shape = Shape.CIRCLE;

		ShapeDrawer drawer;

		switch (shape) {
			case TRIANGLE:
				drawer = new TriangleDrawer();
				break;
			case CIRCLE:
				drawer = new CircleDrawer();
				break;
			default:
				throw new IllegalArgumentException("Shape is not supported: " + shape);
		}

		drawer.drawTheShape();
	}
}
