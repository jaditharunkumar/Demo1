package com.myfirstproject;

public class Account {

	String cName;
	// int accNo;
	double accBal;
	String accStatus;

	static int accNo = 101;

	void display() {
		System.out.println("******AccountNo: " + accNo + "*********");
		System.out.println("Customer: " + cName);
		System.out.println("AccountBalance: " + accBal);
		System.out.println("AccountStatus: " + accStatus);
		accNo++;
	}

	public static void main(String[] args) {
		Account c1 = new Account();

		c1.cName = "Sanjay";
		// c1.accNo = 101;
		c1.accBal = 5000000;
		c1.accStatus = "Active";
		c1.display();

		Account c2 = new Account();
		c2.cName = "Sai";
		c2.accBal = 6000000;
		c2.accStatus = "Active";
		c1.display();

		Account c3 = new Account();
		c3.cName = "Prashanth";
		c3.accBal = 7000000;
		c3.accStatus = "Active";
		c3.display();

		Account c4 = new Account();
		c4.cName = "TharunSuriya";
		c4.accBal = 4000000;
		c4.accStatus = "Active";
		c4.display();

	}

}
