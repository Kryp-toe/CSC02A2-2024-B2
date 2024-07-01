package acsse.csc2a.model;

import acsse.csc2a.visitor.AbstractShapeVisitable;
import acsse.csc2a.visitor.AbstractShapeVisitor;

public class Circle implements AbstractShapeVisitable{
	private double radius;

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void accept(AbstractShapeVisitor arg0) {
		arg0.visit(this);
	}
}
