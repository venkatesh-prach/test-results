package com.singtel.test.bird;

import java.util.HashMap;
import java.util.Map;

import com.singtel.test.ablitities.SoundAbility;
import com.singtel.test.ablitities.WalkAbility;

public class Rooster extends Animal  implements WalkAbility, SoundAbility {

	private Chicken chicken;
	
	private Map<String, String> roosterSoundByLanguage;

	public Rooster() {
		chicken = new Chicken();
		roosterSoundByLanguage = new HashMap<String, String>();
		loadRoosterSounds();
	}

	@Override
	public void says() {
		System.out.println("Cock-a-doodle-doo");
	}

	public Chicken getChicken() {
		return chicken;
	}
	
	private void loadRoosterSounds() {
		roosterSoundByLanguage.clear();
		roosterSoundByLanguage.put("Danish","kykyliky");
		roosterSoundByLanguage.put("Dutch","kukeleku");
		roosterSoundByLanguage.put("Finnish","kukko kiekuu");
		roosterSoundByLanguage.put("French","cocorico");
		roosterSoundByLanguage.put("German","kikeriki");
		roosterSoundByLanguage.put("Greek","kikiriki");
		roosterSoundByLanguage.put("Hebrew","coo-koo-ri-koo");
		roosterSoundByLanguage.put("Hungarian","kukuriku");
		roosterSoundByLanguage.put("Italian","chicchirichi");
		roosterSoundByLanguage.put("Japanese","ko-ke-kok-ko-o");
		roosterSoundByLanguage.put("Portuguese","cucurucu");
		roosterSoundByLanguage.put("Russian","kukareku");
		roosterSoundByLanguage.put("Swedish","kuckeliku");
		roosterSoundByLanguage.put("Turkish","kuk-kurri-kuuu");
		roosterSoundByLanguage.put("Urdu","kuklooku");
		roosterSoundByLanguage.put("Telugu","kokkaro-ko");
	}
	
	public String getRoosterSoundByLanguage(String Language) {
		if (roosterSoundByLanguage.containsKey(Language)) {
			return roosterSoundByLanguage.get(Language);
		}
		return "Rooster Language Sound not defined";
		
	}
	
	
}
