package arrays;

public class SumOfPrevAndNext {

	public static void main(String[] args) {
		int arr[] = { 55,65,75,85,95};

		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
             int  sum=0;
             if(i<=0 ) {
            	 sum=arr[i+1];
             }
             else if(i>=arr.length-1) {
            	 sum=arr[i-1];
             }
             else {
            	 sum=arr[i-1]+arr[i+1];
             }
             temp[i]=sum;
		}
		for (int i = 0; i < arr.length; i++) {
            
           System.out.print(temp[i]+" ");
		}
		
	}
	

}
