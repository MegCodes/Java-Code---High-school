package lesson8;

public abstract class RightTriangle extends Shape {
	public RightTriangle(int height, int width) {
		super(height, width);
	}
	
	protected String getName() {
		return "right triangle";
	}
	
	protected double getArea() {
		return height * width / 2; 
	}
	
	protected double getPerimeter() {
		return height + width + Math.sqrt(height * height + width * width);
	}
}
