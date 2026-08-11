package com.fundamentals;

public class TrainTicket {
	String passengerName;
	int age;
	String source;
	String destination;
	static int NumberOfTickets;
	static int TotalTicketsBought = 0;
	static int TotalAmount = 0;
	static int Price = 500;
	static {
		System.out.println("Welcome to Vande Express Thank you for choosing us ");
	}

	void BookTicket() {

		TotalTicketsBought += NumberOfTickets;
		TotalAmount += NumberOfTickets * Price;
	}

	void DisplayBookinDetails() {
		System.out.println(" the passenger  is: " + passengerName);
		System.out.println(" age of passenger is :" + age);
		System.out.println(" the source is :" + source);
		System.out.println(" the destination is :" + destination);
		System.out.println(" the no of tickets are  :" + NumberOfTickets);
		System.out.println(" amount for tickets  :" + (Price * NumberOfTickets));

	}

	static void TicketCounter() {
		System.out.println("******************TICKET COUNTER****************** ");

		System.out.println(" the total Tickets bought are :" + TotalTicketsBought);
		System.out.println(" the total Tickets amount is are :" + TotalAmount);
	}

	public static void main(String[] args) {
		TrainTicket tc = new TrainTicket();
		TrainTicket tc1 = new TrainTicket();
		System.out.println("******************Passenger 1 Details****************** ");

		tc.passengerName = "sai";
		tc.age = 22;
		tc.source = "HYD";
		tc.destination = "DELHI";
		NumberOfTickets = 12;
		tc.DisplayBookinDetails();
		tc.BookTicket();
		System.out.println("******************Passenger 2 Details****************** ");
		tc1.passengerName = "manohar";
		tc1.age = 70;
		tc1.source = "BIHAR";
		tc1.destination = "PAKISTHAN";
		NumberOfTickets = 1;
		tc1.DisplayBookinDetails();
		tc1.BookTicket();

		TicketCounter();

	}
}