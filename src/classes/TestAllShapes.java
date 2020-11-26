package classes;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import gui.*;

class TestAllShapes {

	//Test Circle ----------------------------------------------------------------
	@Test
	public void testCircleArea() {
		Circle circle = new Circle(5);
		assertTrue(Math.PI * Math.pow(5, 2) == circle.area());
	}
	
	@Test
	public void testCirclePerimeter(){
		Circle circle = new Circle(5);
		assertTrue(2 * Math.PI * 5 == circle.perimeter());
	}
	
	//Test Rectangle ----------------------------------------------------------------
	@Test
	public void testRectanleArea() {
		Rectangle rectangle = new Rectangle(8, 3);
		assertTrue(24 == rectangle.area());
	}
	
	@Test
	public void testRectanlePerimeter(){
		Rectangle rectangle = new Rectangle(5, 5);
		assertTrue(20 == rectangle.perimeter());	
	}
	
	
	//Test Rhombus ----------------------------------------------------------------
	@Test
	public void testRhombusArea() {
		Rhombus rhombus = new Rhombus(6.7, 6);
		assertTrue(40.2 == rhombus.area());
	}
	
	@Test
	public void testRhombusPerimeter(){
		Rhombus rhombus = new Rhombus(6.7, 6);
		assertTrue((4 * 6.7) == rhombus.perimeter());
	}
	
	//Test Triangle ----------------------------------------------------------------
	@Test
	public void testTriangleArea() {
		Triangle triangle = new Triangle(15, 4, 0, 0 , 0);
		assertTrue(30 == triangle.area());
	}
	
	@Test
	public void testTrianglePerimeter(){
		Triangle triangle = new Triangle(15, 8, 12, 10 , 10);
		assertTrue(32 == triangle.perimeter());
	}
	
	//******Demos*******
	
	//assertTrue
	@Test
	public void testdemo1(){
		Triangle triangle = new Triangle(15, 8, 12, 10 , 10);
		assertTrue(32 == triangle.perimeter());
	}
	
	//assertFalse
	@Test
	public void testdemo2() {
		Triangle triangle = new Triangle(15, 4, 0, 0 , 0);
		assertFalse(30 != triangle.area());
	}
	
	//assertEquals
	@Test
	public void testdemo3() {
		Square square = new Square(2);
		assertEquals(4,square.area()); 
	}
	
	@Test
	public void testdemo4() {
		Square square = new Square(2);
		assertEquals(8,square.perimeter()); 
	}
	
	
	
}
