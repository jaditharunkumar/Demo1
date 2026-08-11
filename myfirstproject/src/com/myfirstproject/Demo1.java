package com.myfirstproject;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int n = sc.nextInt();
		for (int T = 1; T <= n; T++) {
			System.out.println(T);
		}
		System.out.println("*******************************");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int k = 2; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.println();
			}
			System.out.println("*******************************");

			for (int j = 10; j >= 1; j--) {
				System.out.println(j);
			}
		}

	}

}
