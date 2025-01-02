package com.winter.app.weapons;

public class Sword {
	
	private String name;
	private int damage;
	private int range;
	
	public Sword() {
		this.name="단검";
		this.damage=10;
		this.range=2;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.damage);
		System.out.println(this.range);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	
	

}
