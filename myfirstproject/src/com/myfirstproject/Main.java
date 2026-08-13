package com.myfirstproject;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main method Started");

		Main g1 = new Main();// Object created
		System.out.println(g1);// Address of the object--->2b2fa4f7

		
		Main g2 = new Main();
		System.out.println(g2);
		
		//int i1 = 0x2b2fa4f7;
		//System.out.println(i1);// 724542711 this output and this a hashcode
		//System.out.println(g1.hashCode());
	}
}
