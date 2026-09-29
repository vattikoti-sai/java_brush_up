package arrays;

import java.util.Arrays;

public class MergeOfArray {

	public static void main(String[] args) {
     
		int []arr1= {1,2,3,4 };
		int []arr2= { 6,7,8};
		int[]c1=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			c1[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			c1[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(c1));
		
	}

}
