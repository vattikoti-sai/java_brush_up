package loops;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random d = new Random();
		int s=d.nextInt(1,10);

int i=3;
int chances=i-1;

while(i>0) {
	System.out.println("enter your number : ");
	int n=sc.nextInt();
	if(s==n) {
		System.out.println(" you won ");
		break;
	}else {
		
		if(chances==0) {
			System.out.println("better luck next time ");
		}
	}
	i--;
	chances--;
}


		
	}

}
