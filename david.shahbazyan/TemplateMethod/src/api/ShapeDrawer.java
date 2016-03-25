package api;

/**
 * Author: David.Shahbazyan Created: Mar 25, 2016
 */
public abstract class ShapeDrawer {
	public abstract String getShapeToDraw();

	public abstract String getShapeColor();

	public void drawTheShape() {
		System.out.println("DRAWING: Shape -> " + getShapeToDraw() + ", Color -> " + getShapeColor() + ".");
	}
}
