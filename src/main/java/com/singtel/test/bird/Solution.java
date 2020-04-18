package com.singtel.test.bird;
public class Solution {
	public static void main(String[] args) {
		
		Bird duck = new Duck();
		duck.says();
		duck.swim();
		
		Bird chicken = new Chicken();
		chicken.says();
		chicken.fly();
	}
}