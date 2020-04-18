package com.singtel.test.bird;

public class Solution {
	public static void main(String[] args) {
		Rooster rooster = new Rooster();
		rooster.says();
		rooster.fly();
		// Created Chicken Object from Rooster
		Chicken chicken = rooster.getChicken();
		chicken.says();
	}
}