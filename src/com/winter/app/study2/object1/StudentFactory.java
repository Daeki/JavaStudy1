package com.winter.app.study2.object1;

public class StudentFactory {
	
	//리턴할 데이터타입
	//리턴이 없음
	public int t1(int num, int num2) {
		int sum = num+num2;
		int avg = sum/2;
		
		if(sum<0) {
			return sum;
			
		}
		
		//리턴은 한개의 값만 가능
		//메서드의 종료는 {} 끝을 만나거나
		//return을 만났을때 
		return sum+3/2;
	}
	
	public String t2() {
		String result="";
		
		
		return result;
	}
	
	public void t3(int num) {
		if(num<0) {
			
			return;
		}
		
		
	}

}




