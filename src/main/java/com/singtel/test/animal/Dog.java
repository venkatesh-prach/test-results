package com.singtel.test.animal;

import com.singtel.test.bird.Animal;

public class Dog extends Animal{
	
	@Override
	public void says() {
		System.out.println("Woof, woof");
	}

}
