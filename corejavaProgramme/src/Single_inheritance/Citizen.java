package Single_inheritance;

public class Citizen {
 private int cid;
 private int age;
 private String name;
 
 
 public Citizen() {
	 System.out.println("citizen is printed");
 }
 
 public Citizen(int cid , int age , String name) {
	 this.cid = cid;
	 this.age = age;
	 this.name = name;
 }

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Citizen [cid=" + cid + ", age=" + age + ", name=" + name  + "]";
}

 
}
