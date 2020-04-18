package com.singtel.test.insects;

import com.singtel.test.ablitities.FlyAbility;
import com.singtel.test.ablitities.NotSingAbility;
import com.singtel.test.ablitities.NotSwimAbility;

public class Butterfly extends Caterpillar implements NotSingAbility, NotSwimAbility , FlyAbility {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void says() {

		System.out.println("I can't  make a sound");
	}
	
	@Override
	public void walk() {
		System.out.println("I can't Walk");
	}

}
