package Single_inheritance;

public class CitizenDemoJava extends Citizen {
	private int sid;
	private String course;
	public CitizenDemoJava()
 {
	System.out.println("Student object created");
	}
public CitizenDemoJava(int cid,int age,String name,int sid,String course) {
	super(cid,age,name);
	this.sid=sid;
	this.course=course;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "CitizenDemoJava [cid ="+super.getCid() +",age ="+super.getAge()+", name ="+super.getName()+",sid=" + sid + ", course=" + course + "]";
}

}
