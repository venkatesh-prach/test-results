package com.singtel.test.bird;

import com.singtel.test.ablitities.SoundAbility;
import com.singtel.test.ablitities.WalkAbility;

public class Rooster extends Animal  implements WalkAbility, SoundAbility {

	private Chicken chicken;

	public Rooster() {
		chicken = new Chicken();
	}

	@Override
	public void says() {
		System.out.println("Cock-a-doodle-doo");
	}

	public Chicken getChicken() {
		return chicken;
	}
	
	
}
