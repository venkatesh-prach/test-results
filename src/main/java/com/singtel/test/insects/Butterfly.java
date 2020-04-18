package com.singtel.test.insects;

import com.singtel.test.bird.Animal;

public class Butterfly extends Animal {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void says() {

		System.out.println("I can't  make a sound");
	}

}
