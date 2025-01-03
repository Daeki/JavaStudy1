package com.winter.app.himart;

public class Computer extends Machine {
	
	private String cpu;
	
	public Computer() {
		this.setPrice(200);
		this.setPoint(20);
		this.setBrand("Samsung");
		this.setCpu("Intel I9");
	}
	
	public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public void info() {
		super.info();
		System.out.println(this.cpu);
	}

}
