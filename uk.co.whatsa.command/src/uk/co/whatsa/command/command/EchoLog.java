package uk.co.whatsa.command.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

@Component
public class EchoLog implements LogListener {

	@Override
	public void logged(LogEntry entry) {
		System.out.println(entry.getMessage());
	}
}