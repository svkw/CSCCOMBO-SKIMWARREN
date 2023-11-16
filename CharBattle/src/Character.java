
public class Character {
	private String name;
	private int strength;
	private int speed;
	private double health;
	private Weapon weapon;
	
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(String nameWeapon, double damageFact) {
		this.weapon = new Weapon(nameWeapon, damageFact);
	}

	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Character(String name, int strength, int speed, double health) {
		super();
		this.name = name;
		this.strength = strength;
		this.speed = speed;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	// Methods
	public double doDamage(double damage) {
//		double randomNum = rand.nextDouble();
		double madedamage = strength * weapon.getDamageFactor();
		return madedamage;
	}
	
	public void recordDamage(double damage) {
		health = health - damage;
		if (health < 0) {
			health = 0;
		}
	}
	
	public boolean isDead() {
		return health <= 0;
	}

//	private String name;
//	private int strength;
//	private int speed;
//	private int health;

	@Override
	public String toString() {
		return "Character name : " + name 
				+ "\nstrength : " + strength 
				+ "\nspeed : " + speed 
				+ "\nhealth : " + health 
				+ "\nweapon : " + weapon + "\n";
	}

}
