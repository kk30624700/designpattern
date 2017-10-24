package design.pattern.singleton;

public class SingletonC {
	private SingletonC() {}

	private static SingletonC instance;

	public static SingletonC getInstance() {
		if (instance == null) {
			synchronized (SingletonC.class) {
				if (instance == null) {
					instance = new SingletonC();
				}
			}

		}
		return instance;
	}
}
