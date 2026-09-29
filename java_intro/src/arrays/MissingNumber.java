package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= { 1,4,5,9,11};
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]-arr[i]==1) {
				continue;
			}
			else {
				for(int j=1;j<arr[i+1]-arr[i];j++) {
					System.out.print(arr[i]+j+" ");
				}
					
				
				
			}
		}

	}

}
