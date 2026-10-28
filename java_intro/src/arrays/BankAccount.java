package arrays;

public class BankAccount {
	
	
	private String AccountHolder;
   private Double balance;
   public String getAccountHolder() {
	return AccountHolder;
   }
   public void setAccountHolder(String  accountHolder) {
	AccountHolder = accountHolder;
   }
   public double getBalance() {
	return balance;
   }
   public void setBalance(double balance) {
	this.balance = balance+1000;
   }
   
	

}
