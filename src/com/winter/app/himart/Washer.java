package com.winter.app.himart;

public class Washer extends Machine{
	
	private int volume;
	private String kind;
	
	public Washer() {
		this.setPrice(100);
		this.setPoint(10);
		this.setBrand("Daewoo");
		this.volume=20;
		this.kind="통돌이";
	}
	
	
	
	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}



	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(this.volume);
		System.out.println(this.kind);
	}

}
