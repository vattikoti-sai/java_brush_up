package arrays;

public class BankMain {

	public static void main(String[] args) {
       
		BankAccount ba = new BankAccount();
		ba.setAccountHolder("sai");

		System.out.println("account name = "+ba.getAccountHolder());
		ba.setAccountHolder("sai");
		
		ba.setBalance(1000);
		System.out.println("account balance = "+ba.getBalance());
		
	}
	

}
