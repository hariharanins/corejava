package MultilevelInheritance;

public class Maruti extends Car {
   String brand;
   String speed;
   public Maruti() {
	   System.out.println("class maruti");
   }
   public void brand() {
	   System.out.println("brand : maruti");
   }
   public void speed() {
	   System.out.println("max : 90kmph");
   }
}
