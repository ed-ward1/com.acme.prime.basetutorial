package com.acme.prime.eval.provider;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Example JUNit test case
 *
 */

public class EvalImplTest {

	/*
	 * Example test method
	 */

	@Test
	public void simple() throws Exception {
		EvalImpl t = new EvalImpl();
		assertEquals(3.0, t.eval("1 + 2"), 0d);
	}

}
