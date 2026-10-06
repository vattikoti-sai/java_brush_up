package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
          int []arr= {10,30,10,20,10,30,20,30,40};
          
          boolean[] visited=new boolean[arr.length];
          
          for(int i=0;i<arr.length;i++) {
        	  int count=1;
        	  if(visited[i])
        		  continue;
        	  for(int j=i+1;j<arr.length;j++) {
        		  if(arr[i]==arr[j]) {
        			  visited[j]=true;
        			  count++;
        		  }
        	  }
        	  if(count>1) {
        		  System.out.print(arr[i]+" ");
        	  }
          }
          
          
          
          
          
          
          
          
          
          
	}

}
