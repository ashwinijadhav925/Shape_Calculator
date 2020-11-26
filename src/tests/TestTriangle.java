package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Triangle;

public class TestTriangle {

	@Test
	public void testArea() {
		Triangle triangle = new Triangle(15, 4, 0, 0 , 0);
		assertTrue(30 == triangle.area());
	}
	
	@Test
	public void testPerimeter(){
		Triangle triangle = new Triangle(15, 8, 12, 10 , 10);
		assertTrue(32 == triangle.perimeter());
	}

}
