package Statickeyword;

public class StaticMethod {
	int id =111;
	static int rollno =222;

	
	//static block
	static {
		System.out.println("staticvariable");
		//System.out.println("ID; "+id);//normal variable cont be declared in static block . only static variable is declared
		System.out.println("ROLL NO ; "+rollno);
	}
	
	//default constructor
	StaticMethod(){
		System.out.println("ID;"+id);//inside static metod nonstatic variable can be declared
		System.out.println("ROLLNO;"+rollno);
	}
	//normal method
	void display() {
		System.out.println("normal method");
	}
	//static method
	static void print() {
		System.out.println("static methopd");
		
	}
}
