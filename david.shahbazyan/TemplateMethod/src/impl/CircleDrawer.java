package impl;

import api.ShapeDrawer;

/**
 * Author: David.Shahbazyan Created: Mar 25, 2016
 */
public class CircleDrawer
		extends ShapeDrawer {
	@Override
	public String getShapeToDraw() {
		return "Circle";
	}

	@Override
	public String getShapeColor() {
		return "Blue";
	}
}
