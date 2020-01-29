package lesson8;

public abstract class Rectangle extends Shape {
	public Rectangle(int height, int width) {
		super(height, width);
	}
	
	protected String getName() {
		return "rectangle";
	}
	
	protected double getArea() {
		return height * width; 
	}
	
	protected double getPerimeter() {
		return height * 2 + width * 2;
	}
}

