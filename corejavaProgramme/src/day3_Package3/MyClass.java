package day3_Package3;

public class MyClass {
	private static MyClass obj = new MyClass();
	private int id;
	public static MyClass getobj() {
		return obj;
	}
	public static void setM(MyClass obj) {
		MyClass.obj = obj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	

}
