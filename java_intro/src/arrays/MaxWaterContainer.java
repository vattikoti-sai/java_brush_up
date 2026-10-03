package arrays;

public class MaxWaterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {2,1,5,6,2,3 };
        int max=0;
        String s="";
        for(int i=0;i<=arr.length-2;i++) {
        	for(int j=i+1;j<=i+1;j++) {
        		if(arr[i]<arr[j]) {
        			if(arr[i]*2>max) {
        				max=arr[i]*2;
        				s= " the bars with heights "+arr[i]+" and "+arr[j]+" forms the largest rectangle with area "+arr[i]+"*2"+" = "+max;
        			}
        		}
        		
        	}
        }
        System.out.println(s);
	}

}
