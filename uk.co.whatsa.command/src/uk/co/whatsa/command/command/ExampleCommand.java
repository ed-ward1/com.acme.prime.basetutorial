package uk.co.whatsa.command.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import org.osgi.service.log.LogService;
import osgi.enroute.debug.api.Debug;

@Component(service=ExampleCommand.class, property = { Debug.COMMAND_SCOPE + "=example",
		Debug.COMMAND_FUNCTION + "=example" })
public class ExampleCommand {
	@Reference
	private LogService log;

	public void example(String message) {
		log.log(LogService.LOG_ERROR, message);
	}
	
	public void example(String s1, String s2) {
		example(s1);
		example(s2);
	}
}