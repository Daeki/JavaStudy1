package com.winter.app.himart;

public class Tv extends Machine{
	
	private String pixel;
	private int size;
	
	public Tv() {
		this.setPrice(600);
		this.setPoint(60);
		this.setBrand("LG");
		this.setPixel("8K");
		this.setSize(80);
	}
	
	public void info() {
		super.info();
		System.out.println(this.pixel);
		System.out.println(this.size);
	}
	
	
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
