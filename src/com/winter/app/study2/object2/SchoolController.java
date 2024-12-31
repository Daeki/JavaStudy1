package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolController {
	
	
	//start
	public void start() {
		
		//1. 학생정보입력 2.학생정보출력 3.프로그램종료
		Scanner sc = new Scanner(System.in);
		
		boolean check=true;
		SchoolMateFactory sf = new SchoolMateFactory();
		SchoolMateView sv = new SchoolMateView();
		SchoolMate st=null;
		SchoolMate [] schoolMates = new SchoolMate[0];
		
		while(check) {
			System.out.println("1. 학생정보입력 2.학생정보출력 3.프로그램종료");
			int select = sc.nextInt();
			if(select==1) {
				schoolMates = sf.make(schoolMates);
				
			}else if(select==2) {
				
				sv.viewAll(schoolMates);
				
			}else {
				System.out.println("종료");
				break;
			}
		}
		
		
	}

}
