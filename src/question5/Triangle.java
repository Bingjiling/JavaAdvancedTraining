package question5;

import java.util.List;

public class Triangle extends Shape{
	
	public Triangle(List<Double> sides) {
		size = sides;
	}

	@Override
	public void calculateArea() {
		Double p = (size.get(0) + size.get(1) + size.get(2))/2;
		area = Math.pow(p*(p-size.get(0)*(p-size.get(1))*(p-size.get(2))), 0.5);
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
