package com.winter.app.study2.object4;

public class ModTest {
	
	public int num1;
	protected int num2;
	int num3;
	private int num4;
	
	public ModTest() {}
	
	public ModTest getInstance() {
		return new ModTest();
	}
	
	public void m1() {
		this.num4=4;
	}
	
	protected void m2() {
		this.m4();
	}
	
	void m3() {}
	
	private void m4() {}

}
