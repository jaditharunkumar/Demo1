package com.myfirstproject;

public class Employee {

	int empId;
	String empName;
	int empSalary;
	String empExperience;
	String empGrade;
	String empPermanantStatus;
	
	static int count = 1;
	void display() {
		System.out.println("*****Employee " + count + " Details**************");
		System.out.println("EmployeeId: "+empId);
		System.out.println("EmployeeName: "+empName);
		System.out.println("EmployeeSalay: "+empSalary);
		System.out.println("EmployeeExperience: "+empExperience);
		System.out.println("EmployeeGrade: "+empGrade);
		System.out.println("EmployeePermanantStatus: "+empPermanantStatus);
		count++;
		System.out.println("Object call "+count);
	}

	public static void main(String[] args) {
		Employee E1 = new Employee ();
		E1.empId=101;
		E1.empName = "Prashanth";
		E1.empSalary =50000;
		E1.empExperience = "5-years";
		E1.empGrade="A";
		E1.empPermanantStatus="Permanant";
		
		E1.display();
		
		Employee E2 = new Employee ();
		E2 .empId=102;
		E2 .empName = "Sai";
		E2 .empSalary =60000;
		E2 .empExperience = "10-years";
		E2 .empGrade="A";
		E2 .empPermanantStatus="Permanant";
		
		
		E2.display();
		
		Employee E3 = new Employee ();
		E3.empId=103;
		E3.empName = "Sanjay";
		E3.empSalary =50000;
		E3.empExperience = "6-years";
		E3.empGrade="A";
		E3.empPermanantStatus="Permanant";
		
		E3.display();
		
		System.out.println("Object call "+count);
		
		
		
	}

}
