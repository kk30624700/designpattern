package design.pattern.prototype;

public final class Prototype implements Cloneable{
	private int version;
	private SubInfo info;
	
	public Prototype(int version, SubInfo info) {
		this.version = version;
		this.info = info;
	}
	
	public int getVersion() {
		return version;
	}
	
	public SubInfo getInfo() {
		return info;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype cpo = (Prototype)super.clone();
		cpo.info = (SubInfo) info.clone();
		return cpo;
	}
	
	@Override
	public String toString() {
		return "Prototype: " + this.version + " " + info.getMsg();
	}
}

final class SubInfo implements Cloneable{
	private String msg;
	public SubInfo(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return this.msg;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
