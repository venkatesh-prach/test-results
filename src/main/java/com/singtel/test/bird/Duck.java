package com.singtel.test.bird;

import com.singtel.test.ablitities.FlyAbility;
import com.singtel.test.ablitities.SwimAbility;
import com.singtel.test.ablitities.WalkAbility;

public class Duck  extends Bird implements SwimAbility, FlyAbility, WalkAbility{

	public void says() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("I Can Swim");
	}

}
