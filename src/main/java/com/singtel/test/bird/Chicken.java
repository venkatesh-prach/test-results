package com.singtel.test.bird;

import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.ablitities.SoundAbility;
import com.singtel.test.ablitities.WalkAbility;

public class Chicken extends Bird implements SoundAbility, WalkAbility, NotFlyAbility {

	@Override
	public void says() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

}
