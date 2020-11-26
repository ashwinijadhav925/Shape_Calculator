package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Rectangle;


public class TestRectangle {

	@Test
	public void testArea() {
		Rectangle rectangle = new Rectangle(8, 3);
		assertTrue(24 == rectangle.area());
	}
	
	@Test
	public void testPerimeter(){
		Rectangle rectangle = new Rectangle(5, 5);
		assertTrue(20 == rectangle.perimeter());
	}

}
