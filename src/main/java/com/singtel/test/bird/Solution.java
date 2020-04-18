package com.singtel.test.bird;

import com.singtel.test.swimming.animals.Fish;
import com.singtel.test.swimming.animals.SwimmingAnimals;

public class Solution {
	public static void main(String[] args) {
		SwimmingAnimals swimAnimal= new Fish();
		swimAnimal.swim();
		swimAnimal.walk();
		swimAnimal.sing();
		
	}
}