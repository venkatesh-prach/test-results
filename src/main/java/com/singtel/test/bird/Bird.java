package com.singtel.test.bird;

public class Bird extends Animal {
	
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
	@Override
	public void sing() {
		System.out.println("I am Singing");
	}
	
	public void says() {
		System.out.println("Saying Ability not defined");
		
	}
	

}
