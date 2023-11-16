
public class Car {
	// VARIABLE DECLARATION
	private String color;
	private int mileage;
	private double amountOfGas;
	
	private SteeringWheel strWheel;
	private Wheels[] wheels;

	public Car (String color, int mileage, double amountOfGas, SteeringWheel strWheel, Wheels[] wheels) {
		super();
		this.color = color;
		this.mileage = mileage;
		this.amountOfGas = amountOfGas;
		this.strWheel = strWheel;
		this.wheels = wheels;
	}
	
	// CONSTRUCTORS
	public Car () {
		// DEFAULT CONSTRUCTOR
		this.color = "White";
		this.mileage = 100;
		this.amountOfGas = 20.0;
	}
	
	public Car (String color) {
		this.color = color;
//		wheels = new Wheel[4];
//		for (int i = 0; i < wheels.length; i++) {
//			
//		}
	}
	
	public Car (String color, int mile) {
		this.color = color;
		this.mileage = mile;
	}
	
	public Car (String color, int mile, double amntGas) {
		this.color = color;
		this.mileage = mile;
		this.amountOfGas = amntGas;
		wheels = new Wheels[4];
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getMileage() {
		return mileage;
	}
	
//	public void setMileage(int mileage) {
//		this.mileage = mileage;
//	}
	
	public double getAmountOfGas() {
		return amountOfGas;
	}
	
	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	
	// METHOD
	public void drive(int numMiles) {
		for (int i = 0; i < numMiles; i++ ) {
			System.out.print("+");
		}
		System.out.println();
		mileage =+ numMiles;
		amountOfGas--;
		
	}
	
	public void getWheels() {
		
	} 
	
	// TOSTRING
	public String toString() {
		String str = "Color is " + this.color +
				", Milage is : " + this.mileage +
				", and Amount of Gas : " + this.amountOfGas;
		return str;
	}

}
