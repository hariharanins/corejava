package Employee_MultipleInheritance;

import java.util.Date;
public class Employee extends Person {
   private String deptname;
   private double basesalary;
   
   public Employee(String name , long contactnum , Date dateofbirth , String deptname , double basesalary) {
	   super(name,contactnum,dateofbirth);
	   this.deptname = deptname;
	   this.basesalary =basesalary;
   }

public String getDeptname() {
	return deptname;
}

public void setDeptname(String deptname) {
	this.deptname = deptname;
}

public Double getBasesalary() {
	return basesalary;
}

public void setBasesalary(Double basesalary) {
	this.basesalary = basesalary;
}

@Override
public String toString() {
	return "Employee [deptname=" + deptname + ", basesalary=" + basesalary + "]";
}
   
}
