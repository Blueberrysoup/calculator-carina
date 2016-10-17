import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
	private Calculator testCalc;
	
	@Test
	public void testAdd() {
		testCalc = new Calculator();
		assertEquals(15, testCalc.add(14, 0), 2);
		assertEquals(-1000, testCalc.add(0, -1000), 0);
		assertEquals(90248.60, testCalc.add(5.35, 90243.25), 0);
	}

	@Test
	public void testSubtract() {
		testCalc = new Calculator();
		assertEquals(14, testCalc.subtract(14, 0), 0);
		assertEquals(1000, testCalc.subtract(0, -1000), 0);
		assertEquals(-90237.90, testCalc.subtract(5.35, 90243.25), 0);
	}

	@Test
	public void testMultiply() {
		testCalc = new Calculator();
		assertEquals(0, testCalc.multiply(14, 0), 0);
		assertEquals(-393.3, testCalc.multiply(90.0, -4.37), 0);
		assertEquals(451216.25, testCalc.multiply(5, 90243.25), 0);
	}

	@Test
	public void testDivide() {
		testCalc = new Calculator();
		assertEquals(-3, testCalc.divide(90.0, -30), 0);
		assertEquals(0.0167, testCalc.divide(5, 300), 0.0001);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionByZero(){
		testCalc = new Calculator();
		testCalc.divide(14, 0);
		
	}
}
