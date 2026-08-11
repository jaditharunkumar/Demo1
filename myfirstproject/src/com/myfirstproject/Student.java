package com.myfirstproject;

public class Student {

	static String CollegeName = "JNTUHUCER";
	static String Location ="Agraharam";

	int Roll_No ;
	String Name ;
	long Mobile ;
	String Email;
	String Branch;

	public static void main(String[] args) {

		System.out.println(CollegeName);
		System.out.println(Location);
		
	
		Student s1 = new Student();
		s1.Name ="Prashanth";
		s1.Roll_No = 82;
		s1.Mobile = 663646;
		s1.Email = "hahgajgahgagggagd";
		s1.Branch = "cse";
		System.out.println(s1.Roll_No);
		System.out.println(s1.Name);
		System.out.println(s1.Mobile);
		System.out.println(s1.Email);
		System.out.println(s1.Branch);

	}

}
