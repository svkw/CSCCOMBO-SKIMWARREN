
public class Animal {
	//extends inheritance
	private double length;
	private double height;
	private String color;
	// constructors - pulls from parent/object class
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(double length, double height, String color) {
		super();
		this.length = length;
		this.height = height;
		this.color = color;
	}
	
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String makeNoise() {
		return "noisy animal doble";
	}

	@Override
	public String toString() {
		//return "Animal [length=" + length + ", height=" + height + "]";
		return "Animal class";
	}

}
