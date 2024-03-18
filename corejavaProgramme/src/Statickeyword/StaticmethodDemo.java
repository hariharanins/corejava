package Statickeyword;

public class StaticmethodDemo {
	
	public static void main(String[] args) {
		System.out.println("main function");
		StaticMethod m1 = new StaticMethod();

    
	}
	static {
		System.out.println("static method"); // static block will be executed first
	}

}
