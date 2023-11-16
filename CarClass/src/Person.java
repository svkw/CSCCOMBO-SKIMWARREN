import java.util.Arrays;

public class Person {
	private String fName;
	private String lName;
	private int age;
	private int heightFeet;
	private int heightInch;
	private Car cars;
	private Car[] carsArray;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String fName, String lName, int age, int inches, boolean wantCar) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.heightFeet = inches/12;
		this.heightInch = inches%12;
		cars = new Car();
		
		if (wantCar) {
			cars = new Car("Blue");
		}
	}
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeightFeet() {
		return heightFeet;
	}


	public void setHeightFeet(int heightFeet) {
		this.heightFeet = heightFeet;
	}


	public int getHeightInch() {
		return heightInch;
	}

	public void setHeightInch(int heightInch) {
		this.heightInch = heightInch;
	}


	public Car[] getCarsArray() {
		return carsArray;
	}


	public void setCarsArray(Car[] carsArray) {
		this.carsArray = carsArray;
	}


	public void setCars(Car cars) {
		this.cars = cars;
	}


	public Car getCar() {
		return cars;
	}
	
	public Car[] getCars() {
		return carsArray;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + ", heightFeet=" + heightFeet
				+ ", heightInch=" + heightInch + ", cars=" + cars + ", carsArray=" + Arrays.toString(carsArray) + "]";
	}
	
	
}
