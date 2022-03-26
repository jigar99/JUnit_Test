package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitTesting test  = new JunitTesting();
		int output  = test.square(5);
		
		//positive response
		assertEquals(25,output);
	}

}
