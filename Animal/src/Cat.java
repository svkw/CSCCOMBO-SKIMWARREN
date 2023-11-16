
public class Cat extends Animal {
	private String color;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Cat(double length, double height) {
//		super(length, height);
//		
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Cat(double length, double height, String color) {
//		super(length, height);
//		
//		// TODO Auto-generated constructor stub
//	}
	
	public Cat(double length, double height, String color) {
		super(length, height, color);
		// TODO Auto-generated constructor stub
	}

	public Cat(String color) {
	super();
	this.color = color;
}

	public Cat(String color) {
		super();
		this.color = color;
	}
	
	@Override
	public String makeNoise() {
		return "noisy cat says meow";
	}
	
	public boolean equals(Cat ocat) {
		if (color.equals(ocat.color)) {
			return true;
		}
			else return false;
	}


//	public Cat(double length, double height) {
//		super(length, height);
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public String toString() {
		return "Cat in cat class";
	}
	
	

}
