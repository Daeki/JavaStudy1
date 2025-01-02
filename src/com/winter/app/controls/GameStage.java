package com.winter.app.controls;

import java.util.Random;

import com.winter.app.units.Monster;
import com.winter.app.units.Character;
public class GameStage {
	
	private Random random;
	
	public GameStage() {
		random = new Random();
	}
	
	public void fight(Character character) {
		
		int count=random.nextInt(3)+1;
		Monster [] monsters = new Monster[count];
		
		for(int i=0;i<monsters.length;i++) {
			monsters[i]=new Monster();
		}
		
		this.attack(character, monsters);
	}
	
	private void attack(Character character, Monster[]monsters) {
		
		for(int i=0;i<monsters.length;i++) {
			int d = monsters[i].getPower();
			d = random.nextInt(d);
			character.setHp(character.getHp()-d);
		}
		
	}

}
