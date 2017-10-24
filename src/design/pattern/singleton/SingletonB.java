package design.pattern.singleton;

public class SingletonB {
	private SingletonB() {}
    
    private static SingletonB instance;
    
    public static SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}
