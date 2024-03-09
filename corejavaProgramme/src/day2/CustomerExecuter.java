package day2;

public class CustomerExecuter {

	public static void main(String[] args) {
	       Customer c1 = new Customer();
	       c1.setCid(112);
	       c1.setName("Hari");
	       c1.setAddress("Pondy");
	       System.out.println("Customer id:"+c1.getCid()+"Customer name:"+c1.getName()+"Customer Address:"+c1.getAddress());
	       
	       
	       Customer c2 = new Customer();
	       c2.setCid(113);
	       c2.setName("haran");
	       c2.setAddress("palani");
	       System.out.println(c2); // calling the toString method
	       

	       
	       Customer c3= new Customer(); // default constructor
	       System.out.println(c3);
	       
	       
	       
	      Customer c4 = new Customer( 02 , "hariharan", "chennai");
	      System.out.println(c4);
	}

}


