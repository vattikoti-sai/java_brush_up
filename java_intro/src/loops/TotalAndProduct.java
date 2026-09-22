package loops;

public class TotalAndProduct {

	public static void main(String[] args) {
		int []arr= {88,55,65,44,55};
		int total=0;
		int prod=1;
		
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			prod=prod*arr[i];
		}
     System.out.println(" total is : "+total);
     System.out.println("prod is :"+prod);
		
	}

}
