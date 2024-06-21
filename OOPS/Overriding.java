class Vehicle{
	void drive() {
		System.out.println("Drive() method of base class");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Drive() method of car class");
	}
}

public class Overriding {
	
	public static void main(String args[])
	{
		Car c1= new Car();
		Vehicle v1 = new Vehicle();
		c1.drive();
		v1.drive();
		Vehicle vehicle = new Car();
        // drive() method of Vehicle class is overridden by
        // Car class drive()
        vehicle.drive();
		
	}
}
