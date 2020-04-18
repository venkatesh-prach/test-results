package com.singtel.test.insects;

import com.singtel.test.ablitities.DefaultAbility;

public class Butterfly extends DefaultAbility {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void says() {

		System.out.println("I can't  make a sound");
	}

}
