package arrays;

public class SecondMax {

	public static void main(String[] args) {
   int[] arr= {10,40,30,40,20};
   int Max=arr[0];
   int secondMax=0;
   for(int i=0;i<arr.length;i++) {
	   if(arr[i]>Max) {
		   secondMax=Max;
		   Max=arr[i];
	   }
	   else if(arr[i] > secondMax && arr[i] != Max) {
	        secondMax = arr[i];
	    }
	   
   }
   
   System.out.println("second max is : "+secondMax);
	}

}
