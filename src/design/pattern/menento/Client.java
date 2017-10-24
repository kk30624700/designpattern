package design.pattern.menento;

public class Client {
	public static void main(String[] args) {
		Original ori = new Original(new Storage());
		System.out.println(ori.getState());
		ori.store();
		ori.setState("change");
		System.out.println(ori.getState());
		ori.load();
		System.out.println(ori.getState());
	}
}
