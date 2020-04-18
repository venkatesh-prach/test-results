package com.singtel.test.animal;

import com.singtel.test.bird.Animal;

public class Cat extends Animal {

	@Override
	public void says() {
		System.out.println("Meow");
	}
}
