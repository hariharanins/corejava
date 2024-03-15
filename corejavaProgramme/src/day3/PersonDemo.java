package day3;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person(); //default customer invoked
		
		
		Scanner sc = new Scanner (System.in);
		String Name,city;
		int Age;
		System.out.println("enter person details : Name, Age, city");
		Name =sc.nextLine();
		Age = sc.nextInt();
		sc.nextLine();
		city =sc.nextLine();
		
		//p1.personname = name private member can't accessible
		
		p1.setPersonName(Name);
		p1.setPersonAge(Age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() +"\tcity :" + p1.getPersonCity());
		
		System.out.println("enter person details : name , age , city");
		Name = sc.nextLine();
		Age = sc.nextInt();
		city = sc.nextLine();
		p1 = new Person(Name ,Age , city); // paramaterized constructor invoked
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge :" + p1.getPersonAge() +"\tcity :"+ p1.getPersonCity());
		sc.close();
		

	}
}
