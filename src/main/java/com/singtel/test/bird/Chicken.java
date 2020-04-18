package com.singtel.test.bird;

public class Chicken extends Bird {

	@Override
	public void says() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

}
