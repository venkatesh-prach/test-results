package com.singtel.test.animal;

import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.bird.Animal;

public class Dog extends Animal implements NotFlyAbility{
	
	public void says() {
		System.out.println("Woof, woof");
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
