package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Circle;

public class TestCircle {

	@Test
	public void testArea() {
		Circle circle = new Circle(5);
		assertTrue(Math.PI * Math.pow(5, 2) == circle.area());
	}
	
	@Test
	public void testPerimeter(){
		Circle circle = new Circle(5);
		assertTrue(2 * Math.PI * 5 == circle.perimeter());
	}
	



}
