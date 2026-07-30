package java_intro;

import java.util.*;

public class library {
	static String library = "SPHN";
	static String librarian_name = "VENAKANNA";
	int book_id = 1;
	String title = "Thankyou for leaving";
	String author_name = "JOHN";
	static int available_copies = 3;
	static Scanner sc = new Scanner(System.in);

	void display() {
		System.out.println("*******welcoome to SPHN");
		System.out.println("librarian name: " + librarian_name);
		System.out.println("this is book id: " + book_id);

		System.out.println("title of the book: " + title);
		System.out.println("author name: " + author_name);
		System.out.println("no . of copies available are: " + available_copies);

	}

	void issue_book() {
		available_copies = available_copies - 1;
	}

	void change() {
		System.out.println("enter librarian name");
		librarian_name = sc.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library l1 = new library();
		library l2 = new library();
		library l3 = new library();

		l1.display();
		l1.issue_book();
		System.out.println();
		l1.change();

		l2.display();
		l2.issue_book();
		System.out.println();

		l1.change();

		l3.display();
		l3.issue_book();

	}

}
