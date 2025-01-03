package com.winter.app.himart;

public class Customer {
	
	private int don=1000;
	private int point=0;
	
	public void info() {
		System.out.println("현재금액 : "+don);
		System.out.println("현재포인트 : "+point);
	}
	
	//buy
	public void buy(Machine machine) {
		this.don=this.don-machine.getPrice();
		this.point=this.point+machine.getPoint();
		this.info();
	}
	
	public void buy(Machine [] machines) {
		
		for(int i=0;i<machines.length;i++) {
			this.buy(machines[i]);
		}
		
	}
	
	
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	

}
