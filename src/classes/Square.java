package classes;

public class Square extends Shape2{
	private int side;

	
	public Square(int side){
		this.side = side;
	}
	/*
	 * @return The area of an square.
	 */
	@Override
	public int area() {
		return side * side;
	}
	
	/*
	 * @return The perimeter of an square.
	 */
	@Override
	public int perimeter() {
		return (4 * side);
	}

}
