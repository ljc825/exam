import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	private Triangle triangle = null;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		triangle = new Triangle(0, 0, 0);
		assertEquals("Illegal",triangle.getType(triangle));
		
		triangle = new Triangle(100, 5, 3);
		assertEquals("Illegal",triangle.getType(triangle));
		
		triangle = new Triangle(3, 3, 3);
		assertEquals("Regular",triangle.getType(triangle));
		
		triangle = new Triangle(3, 4, 5);
		assertEquals("Scalene",triangle.getType(triangle));
		
		triangle = new Triangle(2, 3, 3);
		assertEquals("Isosceles",triangle.getType(triangle));
	}

}
