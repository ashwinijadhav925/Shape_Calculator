package classes;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	/*
	 * @return The area of an rectangle.
	 */
	@Override
	public double area() {
		return length * width;
	}
	
	/*
	 * @return The perimeter of an rectangle.
	 */
	@Override
	public double perimeter() {
		return ((2 * length) + (2 * width));
	}

}
