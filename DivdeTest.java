package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DivdeTest {
	
	//postive case
	@Test
	public void test() {
		JunitTesting test  = new JunitTesting();
		Double output  = test.divide(6,3);
		
		//positive response
		assertEquals(2.0,output);
	}
	
	//negative case
	@Test(expected = ArithmeticException.class)
	public void testNegative() {
		JunitTesting test  = new JunitTesting();
		Double output  = test.divide(6,0);		
		//negative response
	}

}
