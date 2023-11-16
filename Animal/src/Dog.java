
public class Dog extends Animal {
	private boolean drool;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dog(double length, double height) {
		super(length, height);
		
		// TODO Auto-generated constructor stub
	}

	public Dog(String color) {
		super();
		
	}
	
//	public Dog(double length, double height) {
//		super(length, height);
//		this.drool = drool;
//	}
	
	public String makeNoise() {
		return "wolf call";
	}
	
	@Override
	public String toString() {
		return "Dog class bluff";
	}

	
}
