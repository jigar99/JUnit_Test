package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JunitTesting test  = new JunitTesting();
		int output  = test.count("alphabet");
		
		//positive response
		assertEquals(2,output);
	}

}
