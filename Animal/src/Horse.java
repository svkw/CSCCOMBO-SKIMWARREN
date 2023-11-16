

public class Horse extends Animal {
	private String color;

	public Horse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Horse(double length, double height) {
		super(length, height);
		
		// TODO Auto-generated constructor stub
	}

	public Horse(String color) {
		super();
		this.color = color;
	}
	
	@Override
	public String makeNoise() {
		return "speedy horse says nehow";
	}


//	public Cat(double length, double height) {
//		super(length, height);
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public String toString() {
		return "horse in horse class";
	}
	
	

}

