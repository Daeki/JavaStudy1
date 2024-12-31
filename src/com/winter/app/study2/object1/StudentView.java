package com.winter.app.study2.object1;

public class StudentView {
	
	//학생의 정보를 출력
	//view
	public void view(Student student) {
		//학생의 이름, 번호
		System.out.println(student.name);
		System.out.println(student.num);
		
	}
	
	//학생들의 정보를 출력
	//viewAll
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
		}
	}

}
