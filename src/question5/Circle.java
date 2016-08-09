package question5;

import java.util.List;

public class Circle extends Shape{
	
	public Circle(List<Double> radius) {
		size = radius;
	}

	@Override
	public void calculateArea() {
		area = Math.pow(size.get(0), 2)*Math.PI;
		area = (double) Math.round(area*1000);
		area = area/1000;
	}

	@Override
	public Double getArea() {
		if(area == 0){
			calculateArea();
		}
		return area;
	}
}
