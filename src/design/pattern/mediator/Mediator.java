package design.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
	private Map<String, Coleague> container = new HashMap<>();
	
	public void register(String info, Coleague coleague) {
		container.put(info, coleague);
	}

	public void transfer(String from, String to, String msg) {
		if (container.containsKey(to)) {
			container.get(to).receive(from ,msg);
		}
	}

}
