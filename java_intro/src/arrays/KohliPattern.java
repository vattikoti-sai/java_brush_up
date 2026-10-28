package arrays;

public class KohliPattern {

	public static void main(String[] args) {
		
		        String str = "KOHLI";
		        char a=97;

		        for (int i = 1; i < 6; i++) {
		            for (int j = 1; j < 6; j++) {

		                if (i == j || i + j == 6) {
		                    System.out.print(str.charAt(i - 1)+" ");
		                } else {
		                    System.out.print(a+" ");
		                    a++;
		                }
		            }
		            System.out.println();
		        }
		    }

	}


