package impl;

import api.ShapeDrawer;

/**
 * Author: David.Shahbazyan Created: Mar 25, 2016
 */
public class TriangleDrawer
		extends ShapeDrawer {
	@Override
	public String getShapeToDraw() {
		return "Triangle";
	}

	@Override
	public String getShapeColor() {
		return "Red";
	}
}
