package com.singtel.test.insects;

public class Butterfly extends Caterpillar {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void says() {

		System.out.println("I can't  make a sound");
	}

}
