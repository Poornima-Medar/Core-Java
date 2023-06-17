import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorialOfFive() {
			assertEquals(120,MathUtil.factorialOf(5));
		}	
	

	@Test
	public void testFactorialOfZero(){
		assertEquals(1,MathUtil.factorialOf(0));
		}	
	

	@Test
	public void testFactorialOfOne() {
		assertEquals(1,MathUtil.factorialOf(1));
		}	
	

	@Test
	public void testFactorialOfNegetiveTwo() {
		assertEquals("The number must be greater than zero",MathUtil.factorialOf(-2));
		}	

}
