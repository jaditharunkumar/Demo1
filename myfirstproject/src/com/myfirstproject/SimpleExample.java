package com.myfirstproject;

import java.util.Scanner;

public class SimpleExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name:");

		String name = sc.nextLine();

		System.out.println("Enter your Age:");

		int age = sc.nextInt();

		System.out.println("Hello " + name);

		System.out.println((120 - age) + " your age till 120");

	}

}
