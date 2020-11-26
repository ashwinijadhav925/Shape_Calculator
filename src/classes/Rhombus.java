package classes;

public class Rhombus extends Shape {
	private double length;
	private double height;
	
	
	public Rhombus(double length, double height){
		this.length = length;
		this.height = height;
	
	}
	
	/*
	 * @return The area of an Rhombus.
	 */
	@Override
	public double area() {
		return length * height;
	}
	/*
	 * @return The perimeter of an Rhombus.
	 */
	@Override
	public double perimeter() {
		return 4 * length;
	}
	
}
