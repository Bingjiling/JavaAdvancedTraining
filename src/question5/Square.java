package question5;

import java.util.List;

public class Square extends Shape{
	
	public Square(List<Double> side){
		size = side;
	}

	@Override
	public void calculateArea() {
		area = Math.pow(size.get(0), 2);
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
