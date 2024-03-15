package day3;

public class Executer {

	public static void main(String[] args) {
		Base m1 = new Base();
		m1.methoddefault();
		m1.methodpublic();
		m1.methodprotected();
		
		m1.vardefault=12;
		m1.methoddefault();
		
		m1.varpublic = 30;
		m1.methodpublic();
		
		
		m1.varprotected = 31;
		m1.methodprotected();
		
	    System.out.println(m1 instanceof Base);
	    
	    
	    
	   
		
	}

}
