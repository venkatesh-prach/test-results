import com.singtel.test.ablitities.FlyAbility;
import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.ablitities.NotSingAbility;
import com.singtel.test.ablitities.NotSwimAbility;
import com.singtel.test.ablitities.NotWalkAbility;
import com.singtel.test.ablitities.SingAbility;
import com.singtel.test.ablitities.SwimAbility;
import com.singtel.test.ablitities.WalkAbility;
import com.singtel.test.animal.Cat;
import com.singtel.test.animal.Dog;
import com.singtel.test.bird.Animal;
import com.singtel.test.bird.Bird;
import com.singtel.test.bird.Chicken;
import com.singtel.test.bird.Duck;
import com.singtel.test.bird.Parrot;
import com.singtel.test.bird.Rooster;
import com.singtel.test.insects.Butterfly;
import com.singtel.test.swimming.animals.Clownfish;
import com.singtel.test.swimming.animals.Dolphins;
import com.singtel.test.swimming.animals.Fish;
import com.singtel.test.swimming.animals.Frog;
import com.singtel.test.swimming.animals.Shark;

public class CountingAnimals {
	public static void main(String[] args) {

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(new Cat()),
				new Fish(), new Shark(), new Clownfish(), new Dolphins(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		int walk = 0;
		int fly = 0;
		int swim = 0;
		int sing = 0;

		String walkAnimalsList = "";
		String flyAnimalsList = "";
		String swimAnimalsList = "";
		String singAnimalsList = "";

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof WalkAbility && !(animals[i] instanceof NotWalkAbility)) {
				walk++;

				walkAnimalsList += "\n" + animals[i].getClass().getSimpleName();
			}
			if (animals[i] instanceof FlyAbility && !(animals[i] instanceof NotFlyAbility)) {
				fly++;
				flyAnimalsList += "\n" + animals[i].getClass().getSimpleName();
			}
			if (animals[i] instanceof SwimAbility && !(animals[i] instanceof NotSwimAbility)) {
				swim++;
				swimAnimalsList += "\n" + animals[i].getClass().getSimpleName();
			}
			if (animals[i] instanceof SingAbility && !(animals[i] instanceof NotSingAbility)) {
				sing++;
				singAnimalsList += "\n" + animals[i].getClass().getSimpleName();
			}
		}
		System.out.println("Animals can fly ----> \t" + flyAnimalsList + " \nTotal Count \n\t" + fly);
		System.out.println("Animals can walk  ----> \t" + walkAnimalsList + " \nTotal Count \n\t" + walk);
		System.out.println("Animals can sing  ----> \t" + singAnimalsList + " \nTotal Count \n\t" + sing);
		System.out.println("Animals can swim  ----> \t" + swimAnimalsList + " \nTotal Count \n\t" + swim);

	}
}
