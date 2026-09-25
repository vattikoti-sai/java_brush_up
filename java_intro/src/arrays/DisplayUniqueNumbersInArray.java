package arrays;

public class DisplayUniqueNumbersInArray {

	public static void main(String[] args) {
		int [] arr= {1,2,5,1,2,4,5};
		int count=0;
			String s=" ";
   for(int i=0;i<arr.length;i++) {
	   for(int j=i+1;j<arr.length;j++) {
		   if(arr[i]==arr[j]) {
			   count++;
			   s=s+" "+arr[i];
		   }
	   }
   }
   System.out.println(" the numbers are : "+s);
   
	}

}
