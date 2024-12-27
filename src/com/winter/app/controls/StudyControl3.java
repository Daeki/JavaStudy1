package com.winter.app.controls;

public class StudyControl3 {
	
	/**
	 * 여러개 중 하나를 선택
	 * if(조건식1){
	 * 		조건식1이 true일 때 실행
	 * }else if(조건식2){
	 * 		조건식2이 true일 때 실행
	 * }else if(조건식3){
	 * 		조건식3이 true일 때 실행
	 * }
	 * ......
	 * }else {
	 * 		그외 나머지
	 * }
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String result="";
		int avg=3;
		
		if(avg>=90) {
			result="A";
		}else if(avg>=80) {
			result="B";
		}else if(avg>=70) {
			result="C";
		}else if(avg>=60) {
			result="D";
		}else {
			result="F";
		}
		
		System.out.println(result);
		System.out.println("프로그램 종료");
	}

}
