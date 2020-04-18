package com.singtel.test.swimming.animals;

import com.singtel.test.bird.Animal;

public class SwimmingAnimals extends Animal {

	@Override
	public void sing() {
		System.out.println("I can't Sing");
	}

	@Override
	public void walk() {

		System.out.println("I can't Walk");
	}

	@Override
	public void swim() {
		System.out.println("I can Swim");
	}
}
