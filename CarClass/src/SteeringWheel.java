
public class SteeringWheel {
	// DATA MEMBERS
	private int dim;
	private boolean airbag;
	private String material;
	
	// CONSTRUCTORS
	public SteeringWheel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SteeringWheel(int dim, boolean airbag, String material) {
		super();
		this.dim = dim;
		this.airbag = airbag;
		this.material = material;
	}

	// GETTERS & SETTERS
	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [dim=" + dim + ", airbag=" + airbag + ", made with=" + material + "]";
	}
	
	
}
