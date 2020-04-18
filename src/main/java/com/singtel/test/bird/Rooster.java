package com.singtel.test.bird;

public class Rooster extends Bird {

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
