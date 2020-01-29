package lesson8;

public abstract class Shape implements Comparable<Shape> {
	protected int height;
	protected int width;
	
	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}	
	public String toString() {
		return getName() + " : " + getArea();
	}
public static void main(String[] args) {
	
	}
	
	
	public final void printArea() {
		System.out.println("This " + getName() + " has a height of " +
			height + ", a width of " + width + ", and an area of " + 
			getArea() + ".");
		
	}
	
	public final void printPerimeter() {
		System.out.println("This " + getName() + " has a height of " +
			height + ", a width of " + width + ", and a perimeter of " + 
			getPerimeter() + ".");
	}
	
	public int compare(Shape s, Shape d) {
		int k = s.getName().compareTo(d.getName());
		if (k !=0) {
		}
		return k;
	
	}
	
	
	
		
	
	protected abstract String getName();
	protected abstract double getArea();
	protected abstract double getPerimeter();
	
}

