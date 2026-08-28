package constructors;


public class BankAccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	BankAccount(long accountNumber,String accountHolderName,double balance,String branch){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;
		
	}
	BankAccount(BankAccount b,long accountNumber,String accountHolderName,double balance){
		this.branch=b.branch;
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	void display() {
		System.out.println("**************************************");
		System.out.println("account number   : "+accountNumber);
		System.out.println("account holder name : "+accountHolderName);
		System.out.println("balance : "+balance);
		System.out.println("branch : "+branch );
	}
	

	public static void main(String[] args) {

		BankAccount ba= new BankAccount(1595956848,"sai",55000,"LB NAGAR");
		
		BankAccount ba1= new BankAccount(ba,751551514,"shiva",66000);
		ba.display();
		ba1.display();
	}

}
