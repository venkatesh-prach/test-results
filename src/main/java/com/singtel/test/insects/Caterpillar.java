package com.singtel.test.insects;

import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.ablitities.NotSingAbility;
import com.singtel.test.ablitities.NotSwimAbility;
import com.singtel.test.ablitities.WalkAbility;
import com.singtel.test.bird.Animal;

public class Caterpillar extends Animal implements NotFlyAbility, NotSwimAbility, NotSingAbility,WalkAbility {
	
	public void fly() {
		
		System.out.println("I cannot fly");
	}
	
	@Override
	public void walk() {
		
		System.out.println("I can walk (crawl)");
	}

	public void swim() {
		// TODO Auto-generated method stub
		
	}

	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
