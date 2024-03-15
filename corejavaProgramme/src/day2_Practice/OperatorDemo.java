package day2_Practice;

public class OperatorDemo {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int c = 30;
		System.out.println("a and b values before the operations : "+a+" " +b);;
	
		
	    ++a;
		int d = ++a + b + a--;
		System.out.println("d value after the operation: "+ d);
		
		int e = c++ + a + b--;
		System.out.println("e value after the operations : "+ e);
		
		System.out.println("a,b,c,d,e values after the operations: " + a + " " + b + " " + c + " " + d + " " + e);
		

	}

}
