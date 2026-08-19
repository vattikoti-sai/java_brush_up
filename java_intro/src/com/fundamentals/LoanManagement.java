package com.fundamentals;

public class LoanManagement {
	static String Cname="GK FINANCE";
	String CustomerName;
	int LoanAmount;
	int IntrestRate;
	int LoanTenure;
	int CalculateIntrest(int amount,int tenure ,int intrest){
		int SimpleIntrest=(amount*tenure*intrest)/100;
		return SimpleIntrest;
	}
	int CalculateTotalAmount(int intrest) {
		int AmountPayable=intrest+LoanAmount;
		return AmountPayable;
	}
	
	int CalculateMonthlyEmi(int payable,int tenure) {
		int monthly_emi=payable/tenure;
		return monthly_emi;
	}
	void DisplayLoanSummary(int payableAmount,int intrest,int emi) {
		System.out.println("*********************************************");
		System.out.println(" WELCOME TO "+Cname+ "  "+CustomerName);
		System.out.println("  your Loan got sanctioned ");
		System.out.println("Amount payable every month will be :"+payableAmount);
		System.out.println("intrest :"+intrest);
		System.out.println(" Your EMI for every month will be :"+emi);
		
	}

	public static void main(String[] args) {
		LoanManagement l1 = new LoanManagement();
		LoanManagement l2= new LoanManagement();
		l1.CustomerName="sai";
		l1.LoanAmount=100000;
		l1.IntrestRate=2;
		l1.LoanTenure=12;
		int intrest=l1.CalculateIntrest(l1.LoanAmount,l1.LoanTenure, l1.IntrestRate);
		int amount=l1.CalculateTotalAmount(intrest);
		int emi=l1.CalculateMonthlyEmi(amount,12);
		l1.DisplayLoanSummary(amount,intrest , emi);
		
		
		l2.CustomerName="shiva";
		l2.LoanAmount=200000;
		l2.IntrestRate=2;
		l2.LoanTenure=12;
		intrest=l2.CalculateIntrest(l2.LoanAmount,l2.LoanTenure, l2.IntrestRate);
		amount=l2.CalculateTotalAmount(intrest);
		  emi=l2.CalculateMonthlyEmi(amount,12);
		l2.DisplayLoanSummary(amount,intrest , emi);
		

	}

}
