package com.winter.app.study2.object3;

public class ObjectEx {
	
	int num1;
	int num2;
	
	public ObjectEx() {
		//
	}
	
	public void eq(ObjectEx ex) {
		if(this.num1==ex.num1&&this.num2==ex.num2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
