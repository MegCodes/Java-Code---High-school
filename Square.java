package lesson8;

public abstract class Square extends Rectangle {
	public Square(int height) {
		super(height, height);
	}
	
	protected String getName() {
		return "square";
	}
}
