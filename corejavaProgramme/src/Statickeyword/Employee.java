package Statickeyword;

public class Employee {
	String name;
	int id;

	
	static String companyName = "TNS";
	Employee(String name , int id){
		this.id = id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +", + CompanyName = "+ companyName +"]";
	}
	
	
	
}
