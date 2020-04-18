package com.singtel.test.bird;

import com.singtel.test.ablitities.SoundAbility;
import com.singtel.test.ablitities.WalkAbility;

public class Animal implements WalkAbility, SoundAbility{
	
	public void walk() {
		System.out.println("I am walking");
	}

	public void says() {
		// TODO Auto-generated method stub
		
	}


}
