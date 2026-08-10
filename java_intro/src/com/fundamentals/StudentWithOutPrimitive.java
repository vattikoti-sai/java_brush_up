package com.fundamentals;
import java.math.BigInteger;

public class StudentWithOutPrimitive {
	Integer stdid;
	String name;
 String gender;
	String branch_name;
	static String college_name="sphn";
	void Display() {
		System.out.println("**********");
		System.out.println("the clg name is :"+college_name);
		System.out.println("the branch name is :"+branch_name);
		System.out.println("gender :"+gender);
		System.out.println("the student name is: "+name);
		System.out.println("the student id is :"+stdid);

	}
	
		

	public static void main(String[] args) {
             
		StudentWithOutPrimitive sd=new StudentWithOutPrimitive();
		sd.branch_name="CSE";
		sd.name="sai";
		sd.stdid=520;
		sd.gender="M";
		sd.Display();
		StudentWithOutPrimitive sd1=new StudentWithOutPrimitive();
		
		sd1.branch_name="DS";
		sd1.name="ABHI";
		sd1.stdid=714;
		sd.gender="F";
		sd1.Display();
		
		StudentWithOutPrimitive sd2=new StudentWithOutPrimitive();
		sd2.branch_name=sd.branch_name+sd1.branch_name;
		sd2.name=sd.name+sd1.name;
		sd2.stdid=sd.stdid+sd1.stdid;
		sd2.gender=sd.gender+sd1.gender;
		sd2.Display();
		

		
	}

}
