package Employee_MultipleInheritance;
import java.util.Date;
public class Person {
	private String name;
	private long contactnum;
	private Date dateofbirth;
	
public Person(String name , long contactnum , Date dateofbirth) {
	super();
	this. name = name;
	this .contactnum  = contactnum;
	this.dateofbirth = dateofbirth;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getContactnum() {
	return contactnum;
}

public void setContactnum(long contactnum) {
	this.contactnum = contactnum;
}

public Date getDateofbirth() {
	return dateofbirth;
}

public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}

@Override
public String toString() {
	return "Person [name=" + name + ", contactnum=" + contactnum + ", dateofbirth=" + dateofbirth + "]";
}

}
