import java.util.Random;

public class Battle {
	
	// data member for Battle class
	// dynamic properties
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character warrior = new Character("Warrior", 15, 60, 2.0);
		Character monster = new Character("Monster", 12, 55, 1.2);
		System.out.println(warrior);
		System.out.println(monster);
		
		warrior.setWeapon("Sword", 0.5);
		
		
		while (!warrior.isDead() && !monster.isDead()) {
			// while both of them are alive
			int turn = rand.nextInt(2);
			double damage = 0.0;
			if (turn ==0) {
				damage = warrior.doDamage(damage);
				monster.recordDamage(damage);
			}
			else {
				damage = warrior.doDamage(damage);
				warrior.recordDamage(damage);
			}
		}
		if (monster.isDead()) {
			// print out monster is dead
			System.out.println(warrior.getName() + " wins!");
		}
		if (warrior.isDead()) {
			// print out warrior is dead
			System.out.println(monster.getName() + " wins!");
		}
		
//		monster.recordDamage(Daddddage0);
//		System.out.println(warrior);

		
//		Character monster = new Character("Monster", 100, 100.0, 30, null);
//		Weapon mWeapon = new Weapon ("Claws", 2, 0.4, true);
//		monster.setWeapon(mWeapon);
//		
//		Character goodGuy = new Character("GoodGuy", 100, 100.0, 30, null);
//		Weapon gWeapon = new Weapon ("Sword", 5, 0.5, true);
//		goodGuy.setWeapon(gWeapon);
//			
//		// double gdf = goodGuy.getWeapon().getDamageFactor();
//		while (!goodGuy.isDead() && !monster.isDead()) {
//			double whoGoes = turn.nextDouble();
//			if (whoGoes > 0.5) {
//				double damage = goodGuy.doDamage();
//				System.out.println("Damage is " + damage);
//		
//				monster.recordDamage(damage);
//			}
//			else {
//				double damage = monster.doDamage();
//				System.out.println("Damage is " + damage);
//		
//				goodGuy.recordDamage(damage);				
//			}
//			System.out.println(monster);
//			System.out.println(goodGuy);
//		}
//		
//		if (monster.isDead()) {
//			System.out.println("Good guy wins!");
//		}
//		else {
//			System.out.println("Monster wins!");
//		}

	}

}
