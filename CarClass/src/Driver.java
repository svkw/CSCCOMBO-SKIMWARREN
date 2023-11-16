
public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Red");
		Car rentCar = new Car("Blue", 140, 30.0);
		
		System.out.println(myCar.toString());
		System.out.println(rentCar.toString());

		Person person = new Person("john", "Doe", 34, 64, true);
		
		Car car = person.getCar();
		car.drive(20);
		// doing the same thing as above
		person.getCar().drive(20);
		System.out.println(person.toString());
		System.out.println(person.getCar().getMileage());
		
		//person.getCar().getAmountOfGas();
		

		
	}

}
