package com.acme.prime.eval.application.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.acme.prime.eval.api.Eval;

import osgi.enroute.debug.api.Debug;

@Component(service = EvalApplication.class, property = { Debug.COMMAND_SCOPE + "=eval",
		Debug.COMMAND_FUNCTION + "=eval" })
public class EvalApplication {
	@Reference
	private Eval eval;

	public double eval(String expression) {
		return eval.eval(expression);
	}
}