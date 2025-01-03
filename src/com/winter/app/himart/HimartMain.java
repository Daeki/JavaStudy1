package com.winter.app.himart;

public class HimartMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		Washer washer = new Washer();
		
		tv.info();
		computer.info();
		washer.info();
		
		Customer customer = new Customer();
		customer.info();
		
		customer.buy(tv.getPrice(), tv.getPoint());

	}

}
