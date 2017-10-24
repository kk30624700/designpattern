package design.pattern.menento;

public class State implements Cloneable{
	private String info;
	
	{
		info = "init";
	}
	
	public void setInfo(String msg) {
		info += " -> " + msg;
	}
	public String getInfo() {
		return info;
	}
	
	@Override
	public Object clone() {
		State obj;
		try {
			obj = (State) super.clone();
			obj.info = new String(info);
			return obj;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
