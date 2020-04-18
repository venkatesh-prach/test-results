package com.singtel.test.bird;

import com.singtel.test.ablitities.FlyAbility;
import com.singtel.test.ablitities.SingAbility;

public class Bird extends Animal implements FlyAbility, SingAbility{
	
	public void fly() {
		System.out.println("I am flying");
	}
	
	public void sing() {
		System.out.println("I am Singing");
	}
	
	public void says() {
		System.out.println("Saying Ability not defined");
		
	}
	

}
