package loops;

import java.util.Scanner;

public class BinaryToDecimal {
	

	public static void main(String[] args) {
		System.out.println("enter binary value n : ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
		int temp=n;
		int sum=0;
     while(n>0) {
    	 n=n/10;
    	 count++;
     }
     for(int i=0;i<count;i++) {
    	
    			int prod=0;

        	 int rem=temp%10;
        	 temp=temp/10;
        	 prod=rem*(int) (Math.pow(2,i));
        	 sum+=prod;
         }
    
     System.out.println(sum);
	}

}
