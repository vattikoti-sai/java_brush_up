package com.fundamentals;


public class Employedetails {
	String EmployeName;
	int Empid;
    static String designation;
	String Department;
	int salary;
	static String RemoteLocation;
	static String CompanyName="suntech solution";
	static String CompanyLocation="Hi-Tech city";
	static {
		System.out.println("\"Welcome to SunTech Solutions!\r\n"
				+ "Employee HRMS Portal\"");
	}
	void DisplayEmployeDetials(){
	System.out.println(" employe name :"+EmployeName);	
	System.out.println(" EMP-ID:"+Empid);
	System.out.println(" Designation :"+designation);
	System.out.println("Department :"+Department);
	System.out.println("salary :"+salary);
	
	}
	void promoteEmploye() {
		designation="manager";
		System.out.println("designation chnaged to :"+designation);
	}
	void UpdateSalary() {
		salary+=5000;
		System.out.println("salary updated to :"+salary);
	}
	void UpdateLocation() {
		RemoteLocation=" kakinada";
		System.out.println("loc changed to :"+RemoteLocation);
	}

	public static void main(String[] args) {
		Employedetails emp1= new Employedetails();
		Employedetails emp2 =new Employedetails();

		emp1.EmployeName="sai";
		emp1.Empid=1;
		designation="team lead";
		emp1.Department="backend";
		emp1.salary=50000;
		emp1.DisplayEmployeDetials();
         emp1.promoteEmploye();
         emp1.UpdateSalary();
         emp1.UpdateLocation();
         System.out.println("**********EMP2*************");
emp2.EmployeName="shiva";
		emp2.Empid=2;
		designation="office boy";
		emp2.Department="adminstrastion";
		emp2.salary=10000;
		emp2.DisplayEmployeDetials();
        emp2.promoteEmploye();
        emp2.UpdateSalary();
        emp2.UpdateLocation();
   
	}

}
