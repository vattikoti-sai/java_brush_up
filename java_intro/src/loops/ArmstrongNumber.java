	package loops;
	import java.util.Scanner;
	public class ArmstrongNumber {
		
		
		static boolean isarmstrong(int n) {
			boolean status=false;
			int temp=n;
			int n1=n;
			int sum=0;
			int count=0;
			int r=0;
			while(n1>0) {
				n1=n1/10;
				count=count+1;
			}
			while(n>0) {
				r=n%10;
				int power =1;
				for(int i=1;i<=count;i++) {
					power=power*r;
				}
				sum=sum+power;
				n=n/10;
			}
			if (temp == sum) {
				status = true;
			}
			return status;
		}
	
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your number :");
	int n = sc.nextInt();
	boolean check=isarmstrong(n);
	if(check) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
	
	
	
	
	}
	
	}
