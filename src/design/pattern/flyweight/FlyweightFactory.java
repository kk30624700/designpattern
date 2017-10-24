package design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> pool = new HashMap<>();
	public Flyweight getFlyweight(String key) {
		if (pool.containsKey(key)) {
			return pool.get(key);
		} else {
			Flyweight obj = new Flyweight(key);
			pool.put(key, obj);
			
			return obj;
		}
	}
}
