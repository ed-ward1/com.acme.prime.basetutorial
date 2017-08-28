package com.acme.prime.eval.provider;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import com.acme.prime.eval.api.Eval;

import osgi.enroute.debug.api.Debug;
import parsii.eval.Parser;

@Designate(ocd = EvalImpl.Config.class, factory = true)
@Component(
		name = "com.acme.prime.eval.provider", 
		property = {
			Debug.COMMAND_SCOPE + "=test", 
			Debug.COMMAND_FUNCTION + "=eval" 
		}
	)
public class EvalImpl implements Eval {
	@ObjectClassDefinition
	@interface Config {
		String name() default "World";
	}

	private String name;

	@Activate
	void activate(Config config) {
		this.name = config.name();
	}

	@Deactivate
	void deactivate() {
	}

	@Override
	public double eval(String expression) throws Exception {
		return Parser.parse(expression).evaluate();
	}

}
