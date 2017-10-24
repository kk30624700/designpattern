package design.pattern.menento;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	private List<State> list = new ArrayList<>();
	
	public State load() {
		if (list.isEmpty())
			throw new RuntimeException();
		return list.remove(0);
	}
	
	public void store(State state) {
		list.add(state);
	}
}
