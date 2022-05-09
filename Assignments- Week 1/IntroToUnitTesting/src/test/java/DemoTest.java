import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

public class DemoTest {	

	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(2, 4, 5));
	}

	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(8, 12, 13));
	}

	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(3, 13, 12));
	}

	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(15, 5, 13));
	}

	@Test
	public void test_is_triangle_5() {
		assertTrue(Demo.isTriangle(15, 13, 5));
	}


	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo.isTriangle(5, 7, 15));
	}

	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Demo.isTriangle(5, 7, 15));
	}

	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Demo.isTriangle(15, 5, 7));
	}

	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Demo.isTriangle(15, 5, 7));
	}

	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Demo.isTriangle(15, 5, 7));
	}

	@Test
	public void test_main_program_1() {
		ByteArrayInputStream in = new ByteArrayInputStream("5\n15\n13\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle."+ System.getProperty("line.separator");

		assertEquals(consoleOutput, out.toString());

	}

}

	
