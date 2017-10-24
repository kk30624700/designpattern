package design.pattern.prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype pro1 = new Prototype(1, new SubInfo("version 1"));
		Prototype pro2 = (Prototype) pro1.clone();
		
		System.out.println("(pro1==pro2): " + (pro1==pro2));
		System.out.println("(pro1.getInfo()==pro2.getInfo()): " + (pro1.getInfo()==pro2.getInfo()));
		System.out.println("pro1: " + pro1);
		System.out.println("pro2: " + pro2);
	}
}
