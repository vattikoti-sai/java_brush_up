package loops;
import java.util.Scanner;

public class StrongNumber {
	static int StrongNumber(int n) {
		int sum=0;
		
		for(; n>0;n=n/10) {
			int fact=1;
			int rem=n%10;
			for(int j=1;j<=rem;j++) {
				fact=fact*j;
			}
			sum+=fact;
		
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		if(StrongNumber(n)==n) {
			System.out.println("strong number ");
		}
		else
		{
			System.out.println(" not strong number ");

		}
		
	}

}
