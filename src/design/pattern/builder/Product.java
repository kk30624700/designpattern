package design.pattern.builder;

public class Product {
	private String msg;
	
	public Product(String msg) {
		this.msg = msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return this.msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
}
