package com.singtel.test.bird;
public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing(); 
		Bird chicken = new Chicken();
		chicken.says();
		chicken.fly();
		chicken.swim();
		Bird duck = new Duck();
		duck.says();
		duck.swim();
	}
}