package com.singtel.test.insects;

import com.singtel.test.ablitities.DefaultAbility;

public class Caterpillar extends DefaultAbility {
	
	@Override
	public void fly() {
		
		System.out.println("I cannot fly");
	}
	
	@Override
	public void walk() {
		
		System.out.println("I can walk (crawl)");
	}

}
