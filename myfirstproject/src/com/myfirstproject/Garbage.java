package com.myfirstproject;

public class Garbage {
 static String Company = "V-cube";
int product_Id;
String product_Name;
String product_Info;

void show() {
	System.out.println("Company Name:"+Company);
	System.out.println("Product_Id:" +product_Id);
	System.out.println("Product_Name:"+product_Name);
	System.out.println("Product_Inf:"+product_Info);
	System.out.println("-----------------------------");
	
}
	public static void main(String[] args) {
		Garbage  p1 = new Garbage();
		p1.product_Id = 1;
		p1.product_Name = "Dell";
		p1.product_Info = "18GB";
		
		p1.show();
		
		Garbage  p2 = new Garbage();
		p2.product_Id = 2;
		p2.product_Name = "HP";
		p2.product_Info = "20GB";
		p2.show();
		}
}
