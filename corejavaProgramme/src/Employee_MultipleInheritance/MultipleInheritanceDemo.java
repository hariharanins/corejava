package Employee_MultipleInheritance;
import java.util.Date;
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Hari",701024,new Date(2003 ,12 , 14));  
		System.out.println(p1);
		
         p1 = new Employee("MONI",84321,new Date(2004 , 7 , 12) ,"sales",45000); // Employee e = new Employee(........) can also be used
         System.out.println(p1);                                                 //system.out.println(e);
        
        p1 = new LeveloneEmployee("Agnel", 24356, new Date(2005, 6 ,7) ,"Account", 85000,200,"signing Authority");   // LevaloneEmployee e1 = new LeveloneEmployee(.......) can also be used
        System.out.println(p1);                                                                                      // system.out.println(e1);
	}

}
