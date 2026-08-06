package com.fundamentals;

public class Employe {
	String name="james";
	double MonthlySalary=5000;
	double MonthlyGst;
	double MonthylyPf;
	double NetMonthlySalary;
	double AnnualGst;
	double AnnualPf;
	double AnnualNetSalary;
	void CalculateMonthlyPf() {
		MonthylyPf=MonthlySalary*2/100;
		System.err.println(" the monthly PF will be :"+MonthylyPf);
	}
	void CalculateMonthlyGST(){
		MonthlyGst=MonthlySalary*3/100;
		System.out.println(" the monthly GST will be :"+MonthlyGst);

	}
	void calculateNetMonthlysalary() {
		NetMonthlySalary=MonthlySalary-MonthylyPf-MonthlyGst;
		System.out.println("the net monthly salary will be :"+NetMonthlySalary);
	}
	void calculateAnnualGST() {
		AnnualGst=MonthlyGst*12;
		System.out.println(" the annual GST will be :"+AnnualGst);

		
	}
	void calculateAnnualPF() {
		AnnualPf=MonthylyPf*12;
		System.out.println(" the annual PF will be :"+AnnualGst);

	}
	void calculateAnnualnetsalary() {
		AnnualNetSalary=NetMonthlySalary*12;
		System.out.println(" the annual netsalary will be :"+AnnualNetSalary);
	}
	void display() {
		System.out.println("empolye"+" "+name+" "+"account details ");
		System.out.println(" the employe salary is :"+MonthlySalary);
	}
	
		public static void main(String[] args) {

			Employe emp1= new Employe();
			emp1.display();
			emp1.CalculateMonthlyPf();
			emp1.CalculateMonthlyGST();
			emp1.calculateNetMonthlysalary();
			emp1.calculateAnnualGST();
			emp1.calculateAnnualPF();
			emp1.calculateAnnualnetsalary();
			
			
			
		
	}

}
