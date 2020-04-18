package com.singtel.test.animal;

import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.bird.Animal;

public class Cat extends Animal implements NotFlyAbility{

	@Override
	public void says() {
		System.out.println("Meow");
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
