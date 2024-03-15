package day3_Package3;

public class MyClassDemo {

	public static void main(String[] args) {
		//we cont create object with private constructor

		// MyClass m = new MyClass();
		MyClass m=MyClass.getobj();
		MyClass m1=MyClass.getobj();
		
		m.setId(10);
		System.out.println(m);
		System.out.println(m1);
	}

}
