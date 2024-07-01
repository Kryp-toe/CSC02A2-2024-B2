package acsse.csc2a.model;

import acsse.csc2a.visitor.AbstractShapeVisitable;
import acsse.csc2a.visitor.AbstractShapeVisitor;

public class Triangle implements AbstractShapeVisitable{
	private double base;
	private double height;
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	
	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void accept(AbstractShapeVisitor arg0) {
		arg0.visit(this);
	}
	
}
