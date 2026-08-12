package com.myfirstproject;

public class EmployeeDetails {

	static String DepartmentName;
	static String Location;
	int Emp_ID;
	String Emp_Name;
	int Emp_Mobile;
	String Emp_Email;

	public static void main(String[] args) {

		String DepartmentName = "J2SE";
		String Location = "KPHB";
		System.out.println("************************************************************");
		EmployeeDetails E1 = new EmployeeDetails();
		E1.Emp_ID = 89;
		E1.Emp_Name = "Prashanth";
		E1.Emp_Mobile = 675424323;
		E1.Emp_Email = "prashanthModel@gmail.com";

		System.out.println("DepartmentName:" + DepartmentName);
		System.out.println("Location:" + Location);
		
		System.out.println("************************************************************");
		System.out.println("Emp_ID:" + E1.Emp_ID);
		System.out.println("Emp_Name:" + E1.Emp_Name);
		System.out.println("Emp_Mobile:" + E1.Emp_Mobile);
		System.out.println("Emp_Email:" + E1.Emp_Email);
		EmployeeDetails E3 = new EmployeeDetails();
		E3.Emp_ID = 85;
		E3.Emp_Name = "Prashanthi";
		E3.Emp_Mobile = 775424323;
		E3.Emp_Email = "prashanthiModel@gmail.com";
		System.out.println("************************************************************");
		System.out.println("DepartmentName:" + DepartmentName);
		System.out.println("Location:" + Location);
		
		System.out.println("************************************************************");
		System.out.println("Emp_ID:" + E3.Emp_ID);
		System.out.println("Emp_Name:" + E3.Emp_Name);
		System.out.println("Emp_Mobile:" + E3.Emp_Mobile);
		System.out.println("Emp_Email:" + E3.Emp_Email);

		EmployeeDetails E2 = new EmployeeDetails();
		E2.Emp_ID = 92;
		E2.Emp_Name = "Tharukumar";
		E2.Emp_Mobile =630450357;
		E2.Emp_Email = "tharunsuriya1817@gmail.com";
		System.out.println("************************************************************");
		System.out.println("DepartmentName:" + DepartmentName);
		System.out.println("Location:" + Location);
		
		System.out.println("************************************************************");
		
		System.out.println("Emp_ID:" + E2.Emp_ID);
		System.out.println("Emp_Name:" + E2.Emp_Name);
		System.out.println("Emp_Mobile:" + E2.Emp_Mobile);
		System.out.println("Emp_Email:" + E2.Emp_Email);

	}

}
