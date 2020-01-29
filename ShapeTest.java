package lesson8;
import java.util.ArrayList; import java.util.Collections;
public class ShapeTest {
public static void main(String args[]) {
} {
ArrayList<Shape> myShapeArray = new ArrayList<Shape>();
myShapeArray.add(new Square(4)); 
myShapeArray.add(new Rectangle(3,2)); 
myShapeArray.add(new RightTriangle(5,2)); 
myShapeArray.add(new Square(2)); 
myShapeArray.add(new RightTriangle(2,4));

System.out.println(myShapeArray); 
Collections.sort(myShapeArray); 
System.out.println(myShapeArray); } }

/*
[square : 16.0, rectangle : 6.0, right triangle : 5.0, square : 4.0, right triangle : 4.0]
[right triangle : 4.0, square : 4.0, right triangle : 5.0, rectangle : 6.0, square : 16.0] 
 */
