package com.myfirstproject;

public class MobileCompany {

	static int count = 0;

	static String companyName;

	String brandName;
	String model;
	double price;
	String ram;

	static {
		companyName = "Lava";
		System.out.println("Static block executed");
	}

	{
		count++;
		System.out.println("Instant block executed");
	}

	static void displayCompany() {
		System.out.println("companyName:" + companyName);
	}

	void displayMobile() {
		System.out.println("******MobileDetails*******");
		System.out.println("BrandName: " + brandName);
		System.out.println("MobileModel: " + model);
		System.out.println("MobilePrice: " + price);
		System.out.println("MobileRam: " + ram);

	}

	public static void main(String[] args) {

		MobileCompany M1 = new MobileCompany();
		M1.brandName = "Asus";
		M1.model = "M0 1 core";
		M1.price = 6000000;
		M1.ram = "8GB";
		M1.displayCompany();
		M1.displayMobile();
		MobileCompany M2 = new MobileCompany();
		M2.brandName = "Lava";
		M2.model = "Agni2 5G";
		M2.price = 7000000;
		M2.ram = "8GB";
		M2.displayCompany();
		M2.displayMobile();
		MobileCompany M3 = new MobileCompany();
		M3.brandName = "Lava";
		M3.model = "agni 3 5GB";
		M3.price = 8000000;
		M3.ram = "8GB";
		M3.displayCompany();
		M3.displayMobile();
		MobileCompany M4 = new MobileCompany();
		MobileCompany M5 = new MobileCompany();
		System.out.println("*************Object**************");
		System.out.println("Object Created: "+count);
	}

}
