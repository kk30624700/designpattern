package design.pattern.flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		System.out.println(factory.getFlyweight("hello world").getMsg());
	}
}
