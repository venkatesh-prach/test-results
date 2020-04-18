package com.singtel.test.bird;

public class Parrot extends Bird {
	
	
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

}
