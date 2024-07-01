package acsse.csc2a.visitor;

import acsse.csc2a.model.Circle;
import acsse.csc2a.model.Rectangle;
import acsse.csc2a.model.Triangle;

public class ShapeAreaVisitor implements AbstractShapeVisitor{

	@Override
	public void visit(Circle circle) {
		double area = Math.PI * Math.pow(circle.getRadius(), 2);
		System.out.println("Circle Area: " + area);
	}

	@Override
	public void visit(Rectangle rectangle) {
		double area = rectangle.getHeight() * rectangle.getWidth();
		System.out.println("Rectangle Area: " + area);
	}

	@Override
	public void visit(Triangle triangle) {
		double area = 0.5 * triangle.getBase() * triangle.getHeight();
		System.out.println("Triangle Area: " + area);
	}
	
}
