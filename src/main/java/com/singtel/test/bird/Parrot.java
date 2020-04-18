package com.singtel.test.bird;

import com.singtel.test.ablitities.NotSwimAbility;
import com.singtel.test.animal.Cat;
import com.singtel.test.animal.Dog;

public class Parrot extends Bird implements NotSwimAbility{
	
	
	private Animal livingWith;
	
	public Parrot(Animal  livingwith) {
		this.livingWith=livingwith;
	}
	
	public Animal getLivingWith() {
		return livingWith;
	}

	public void soundOfLivingWithAnimal() {
		livingWith.says();
	}
	
	public static void main(String[] args) {
		//
		Parrot parrotLivingWithDog= new Parrot(new Dog());
		parrotLivingWithDog.soundOfLivingWithAnimal();
		
		Parrot parrotLivingWithCats= new Parrot(new Cat());
		parrotLivingWithCats.soundOfLivingWithAnimal();
		
		Parrot parrotLivingWithRooster= new Parrot(new Rooster());
		parrotLivingWithRooster.soundOfLivingWithAnimal();
	
	}

	public void swim() {
		// TODO Auto-generated method stub
		
	}

}
