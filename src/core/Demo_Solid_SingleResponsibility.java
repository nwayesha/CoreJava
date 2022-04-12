package core;

class Circle {
	double radius;

	Circle(double rad) {
		this.radius = rad;
	}

	double calculateCircleArea() {
		return 3.14 * radius * radius;
	}
}

class Square {
	double length;

	Square(double len) {
		this.length = len;
	}

	double calculateSquareArea() {
		return length * length;
	}
}

class AreaCalculator{
	double calculateArea(double length, double radius) {
		double squareArea = new Square(length).calculateSquareArea();
		double circleArea = new Circle(radius).calculateCircleArea();
		return squareArea + circleArea;
	}
}

public class Demo_Solid_SingleResponsibility {

	public static void main(String[] args) {
		AreaCalculator areCalc = new AreaCalculator();
		double area = areCalc.calculateArea(10, 7);
		System.out.println("area  >>"+area);
	}

}
