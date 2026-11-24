package exceptionHandling;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Average Calculation");

		try {
			int totalMarks = 0;
			int count = 0;

			int average = totalMarks / count;

			System.out.println("Average: " + average);

		} catch (ArithmeticException e) {
			System.out.println("Exception: Cannot divide by zero");
		}

		System.out.println("\n2. Invalid Array Index");

		try {
			String[] students = { "Ravi", "Sai", "Kiran" };

			System.out.println(students[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: Invalid student record index");
		}

		System.out.println("\n3. Invalid Username Position");

		try {
			String username = "Sai";

			System.out.println(username.charAt(10));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception: Invalid username character position");
		}

		System.out.println("\n4. Null Student Name");

		try {
			String studentName = null;

			System.out.println(studentName.length());

		} catch (NullPointerException e) {
			System.out.println("Exception: Student name is null");
		}

		// 5. Enter string instead of integer for student marks
		System.out.println("\n5. Invalid Student Marks Input");

		try {
			System.out.print("Enter student marks: ");

			int marks = Integer.parseInt(sc.nextLine());

			System.out.println("Student Marks: " + marks);

		} catch (NumberFormatException e) {
			System.out.println("Exception: Please enter integer marks only");
		}

		sc.close();
	}

}
