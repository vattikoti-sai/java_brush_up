package arrays;

import java.util.Scanner;

public class MoveElementsToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[] = {10,20,30,40,50};

        System.out.println("How many elements should move left?");
        int n = sc.nextInt();
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = n; i < arr.length; i++) {
            arr[i - n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[arr.length - n + i] = temp[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
