import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		// animal
		Cat cat = new Cat();
		Animal mm = new Animal();
		Dog dog = new Dog();
		Horse horse = new Horse();
		
		System.out.println(cat);
		System.out.println(cat.makeNoise());
		
		System.out.println(dog);
		System.out.println(dog.makeNoise());
		
		System.out.println(horse);
		System.out.println(horse.makeNoise());
		
		Animal[] animals = new Animal[5];
		animals[0] = new Horse();
		animals[1] = new Cat(3.0, 2.0);
		animals[2] = new Horse();
		animals[3] = new Cat(3.0, 2.0, "Orange");
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].makeNoise());
		}
		
		for(Animal anim: animals) {
			System.out.println(anim.makeNoise());
		}
		
		List<Horse> horses = new ArrayList<>();
		horses.add(new Horse());
		horses.add(new Cat(3.0, 2.0, "Gray"));
		
		public static void printanimalType(Animal[]) anim) {
			for(Animal ani: ani) {
				if (ani instanceof Horse) {
					System.out.println("it's horse");
				}
				else if (animal instanceof Cat) {
					(Cat)animal.getColr() + "Cat");
				}
			}
		}

		// method overload
		// signature : numbers of parameter, different type of parameters
		// can have the same name ; method overload
		

	}

}
