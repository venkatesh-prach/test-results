package com.singtel.test.swimming.animals;

import com.singtel.test.ablitities.NotFlyAbility;
import com.singtel.test.ablitities.NotSingAbility;
import com.singtel.test.ablitities.NotWalkAbility;
import com.singtel.test.ablitities.SwimAbility;

public class Fish extends SwimmingAnimals  implements SwimAbility, NotWalkAbility, NotSingAbility, NotFlyAbility {

	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
