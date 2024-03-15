package MultilevelInheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.VehicleType();
		
		
		Maruti c1 = new Maruti();
		c1.VehicleType();
		c1.brand();
		c1.speed();
		
		
		Maruti800 c2 = new Maruti800();
		c2.VehicleType();
		c2.brand();
		c2.speed();
		

	}

}
