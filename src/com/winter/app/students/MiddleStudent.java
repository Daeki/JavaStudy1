package com.winter.app.students;

public class MiddleStudent extends Student {
	
	
	public MiddleStudent() {
		super("dd");
		System.out.println();
		super.setName("winter");
		System.out.println(super.getName());
		
		this.setName("iu");
		System.out.println(this.getName());
		System.out.println(super.getName());
	}
	

	private int history;
	
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}

	
	

}
