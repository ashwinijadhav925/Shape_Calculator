package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Rhombus;

public class TestRhombus {

	@Test
	public void testArea() {
		Rhombus rhombus = new Rhombus(6.7, 6);
		assertTrue(40.2 == rhombus.area());
	}
	
	@Test
	public void testPerimeter(){
		Rhombus rhombus = new Rhombus(6.7, 6);
		assertTrue((4 * 6.7) == rhombus.perimeter());
	}

}
