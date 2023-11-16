
public class Weapon {
	private String nameWeapon;
	private int rangeWeapon;
	private double damageFactor;
//	private boolean isDead;
	
	public Weapon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Weapon(String nameWeapon, int rangeWeapon) {
		super();
		this.nameWeapon = nameWeapon;
		this.rangeWeapon = rangeWeapon;
	}

	public Weapon(String nameWeapon, double damageFactor) {
		super();
		this.nameWeapon = nameWeapon;
		this.damageFactor = damageFactor;
	}
	
	public Weapon(String nameWeapon, int rangeWeapon, double damageFactor) {
		super();
		this.nameWeapon = nameWeapon;
		this.rangeWeapon = rangeWeapon;
		this.damageFactor = damageFactor;
	}
	
	public Weapon(String nameWeapon, int rangeWeapon, double damageFactor, boolean isDead) {
		super();
		this.nameWeapon = nameWeapon;
		this.rangeWeapon = rangeWeapon;
		this.damageFactor = damageFactor;
//		this.isDead = isDead;
	}

	public String getNameWeapon() {
		return nameWeapon;
	}

	public void setNameWeapon(String nameWeapon) {
		this.nameWeapon = nameWeapon;
	}

	public int getRangeWeapon() {
		return rangeWeapon;
	}

	public void setRangeWeapon(int rangeWeapon) {
		this.rangeWeapon = rangeWeapon;
	}

	public double getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(double damageFactor) {
		this.damageFactor = damageFactor;
	}

	@Override
	public String toString() {
		return "Weapon [nameWeapon : " + nameWeapon 
				+ ", rangeWeapon=" + rangeWeapon 
				+ ", damageFactor=" + damageFactor 	+ "]\n";
	}


}
