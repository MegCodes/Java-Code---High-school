
public class Circle {
	public static void main(String[] args) {
try {
	System.out.print(100+ ", ");
	System.out.print(5/0);
	System.out.print(", " +25);
} catch (ArithmeticException e) {
	System.out.println("Error");
		}
	}
}