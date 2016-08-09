package question5;

import java.util.Arrays;

public class AreaTest {
	
	public static void main(String[] args){
		Shape c = new Circle(Arrays.asList(0.5));
		System.out.println(c.getArea());
		
		Shape s = new Square(Arrays.asList(0.7));
		System.out.println(s.getArea());
		
		Shape t = new Triangle(Arrays.asList(0.3,0.6,1.0));
		System.out.println(t.getArea());
	}
	
}
