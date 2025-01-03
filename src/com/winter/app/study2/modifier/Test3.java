package com.winter.app.study2.modifier;

public class Test3 {
	
	private static Test3 t3;
	
	private String name;
	
	private Test3() {
		
	}
	
	public static Test3 getInstance() {
		//디자인 패턴 중 Singleton
		if(Test3.t3 == null) {
			Test3.t3= new Test3();
		}
		return Test3.t3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
