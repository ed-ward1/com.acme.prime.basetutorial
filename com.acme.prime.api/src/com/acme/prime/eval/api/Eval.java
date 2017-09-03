package com.acme.prime.eval.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A service that evaluates an expression and returns the result
 */
@ProviderType
public interface Eval {
	/**
	 * Evaluate an expression and return the result.
	 */
	double eval(String expression);
}
