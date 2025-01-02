package com.winter.app.units;

public class Pet {
	
	private String name;
	private int power;
	private int mp;
	
	public Pet() {
		this.name="뽀삐";
		this.power=5;
		this.mp=20;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.power);
		System.out.println(this.mp);
		System.out.println("===============");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	

}
