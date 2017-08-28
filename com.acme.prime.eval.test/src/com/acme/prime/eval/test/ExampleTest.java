package com.acme.prime.eval.test;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import com.acme.prime.eval.api.Eval;

/**
 * 
 */

public class ExampleTest {

	private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();

	/*
	 * 
	 */
	@Test
	public void example() throws Exception {
		Assert.assertNotNull(getService(Eval.class));
	}

	@Test
	public void trig() throws Exception {
		Assert.assertSame(1, (int) getService(Eval.class).eval("sin(1)*sin(1)+cos(1)*cos(1)"));
	}

	private <T> T getService(Class<T> clazz) throws InterruptedException {
		ServiceTracker<T, T> st = new ServiceTracker<>(context, clazz, null);
		st.open();
		return st.waitForService(1000);
	}
}
