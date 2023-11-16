
public class Wheels {
	private int radius;
	private String material;
	
	//  CONSTRUCTOR
	public Wheels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Wheels(int radius, String metal) {
		super();
		this.radius = radius;
		this.material = material;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Wheels [radius=" + radius + ", material=" + material + "]";
	}

}
