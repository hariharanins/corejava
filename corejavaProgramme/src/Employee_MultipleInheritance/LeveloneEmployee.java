package Employee_MultipleInheritance;
import java.util.Date;
public class LeveloneEmployee extends Employee{
    private int noofshares;
    private String authority;
    
    public LeveloneEmployee(String name , long contactnum , Date dateofbirth , String deptname , double basesalary , int noofshares , String authority ) {
    	super(name , contactnum , dateofbirth , deptname , basesalary);
    	this.noofshares = noofshares;
    	this.authority = authority;
    }

	public int getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LeveloneEmployee [noofshares=" + noofshares + ", authority=" + authority + "]";
	}
    
}
