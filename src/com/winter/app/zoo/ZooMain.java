package com.winter.app.zoo;

public class ZooMain {

	public static void main(String[] args) {
		Eagle e = new Eagle();
		AirPlane a = new AirPlane();
		
		Flyable f = e;
		
		if(f instanceof Eagle) {
			e = (Eagle)f;
		}else {
		
			a = (AirPlane)f;
		}
		
		System.out.println(a);
		
		

	}

}
