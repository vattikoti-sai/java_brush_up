package com.fundamentals;

import java.util.Scanner;

public class Student {
	int student_id;
	String student_name;
	int eng_marks;
	int tel_marks;
	int hindi_marks;
	int total_marks;
	int total;
	float percent;
	float percentage;
	static String college_name;
	static 	Scanner sc = new Scanner(System.in);


	void set() {
		System.out.println("enter student id :");
		student_id = Integer.parseInt(sc.nextLine());
		System.out.println("enter student name :");

		student_name = sc.nextLine();
		System.out.println("enter telugu marks :");

		tel_marks = Integer.parseInt(sc.nextLine());
		System.out.println("enter hindi marks:");

		hindi_marks = Integer.parseInt(sc.nextLine());
		System.out.println("enter english marks:");

		eng_marks = Integer.parseInt(sc.nextLine());
		
//		this.student_id = id;
//		this.student_name = student_name;
//		this.tel_marks = tel_marks;
//		this.hindi_marks = hindi_marks;
//		this.eng_marks = eng_marks;

	}

	int calculate() {
	    total = tel_marks + hindi_marks + eng_marks;
	    return total;
	}

	float percentage() {
		float percent = (total / 3) ;
		return percent;
	}

	void display() {
		System.out.println("*********student report card******");
		System.out.println("student id  : " + this.student_id);
		System.out.println("student id  : " + this.student_name);

		System.out.println("telugu marks are : " + this.tel_marks);
		System.out.println("hindi marks are : " + this.hindi_marks);
		System.out.println("eng marks are : " + this.eng_marks);
		System.out.println("total marks : " + this.total);
		System.out.println("percentage is : " + this.percentage);

	}

	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();

		
			s.set();
			s.total = s.calculate();
			s.percentage = s.percentage();
			s.display();
			System.out.println("*************");
			s1.set();
			s1.total = s1.calculate();
			s1.percentage = s1.percentage();
			s1.display();
		
		

	}

}
