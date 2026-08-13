package com.fundamentals;

public class DigitalWatch {
	static String brandName = "TITAN";
	static int hours = 11;
	static int minutes = 22;
	static int sec = 4;
	int price = 5000;

	void DisplayTime() {

		System.out.println(+hours + "hr:" + minutes + "min:" + sec + "sec");

	}

	void DisplayWatchDetails() {
		System.out.println("******** WATCH DETAILS*********");
		        System.out.println(DigitalWatch.brandName);
		    System.out.println(" price of " + brandName + " is: " + price);

	}

	void UpdateHour() {
		hours += 1;
		System.out.println("your time is updated with: " + hours);

	}

	void UpdateMintue() {
		minutes += 5;
		System.out.println("your time is updated with :" + minutes);

	}

	public static void main(String[] args) {
		DigitalWatch dw = new DigitalWatch();
		DigitalWatch dw1 = new DigitalWatch();

		dw.DisplayWatchDetails();
		dw.DisplayTime();
		dw.UpdateHour();
		dw.UpdateMintue();
		dw.DisplayTime();
		System.out.println("**********second watch*****************");
		dw1.DisplayWatchDetails();
		dw1.DisplayTime();
		dw1.UpdateHour();
		dw1.UpdateMintue();
		dw1.DisplayTime();

	}

}
