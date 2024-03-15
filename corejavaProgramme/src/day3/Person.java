package day3;

public class Person {
      private String personName;
      private int personAge;
      private String personCity;
      
      
	   public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public Person() {
		System.out.println("Default customer");
		
	}
	public Person(String PersonName ,int PersonAge , String Personcity) {
		System.out.println("Paramaterized constructor");
		this.personName = PersonName;
		this.personAge = PersonAge;
		this.personCity = Personcity;
	}
}