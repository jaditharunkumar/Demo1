package com.myfirstproject;

public class LibraryBookManagement {

	String libraryName;
	String librianName;
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;

	void displayBookDetails() {
		System.out.println("BookId: " +bookId);
		System.out.println("BookTitle: " +bookTitle);
		System.out.println("AuthorName: " +authorName);
		System.out.println("AvailableCopies: " +availableCopies);
		
	}
	
	void displayLibraryDetails() {
		System.out.println("LibraryName: " +libraryName);
		System.out.println("LibrianName: " +librianName);
		
	}
	
	void changeLibraryDetails(String newlibraryName) {
		libraryName = newlibraryName;
		System.out.println("LibraryName: "+libraryName );
	}
	
	
	public static void main(String[] args) {

		LibraryBookManagement l1 = new LibraryBookManagement();
		l1.libraryName = "V-cube";
		l1.librianName = "Sanjay";
		l1.bookId = 1;
		l1.bookTitle = "Java";
		l1.authorName="Prashanth";
		l1.availableCopies = 10;
		
		System.out.println("********Book1***********");
		l1.displayLibraryDetails();
		l1.displayBookDetails();
		
		LibraryBookManagement l2 = new LibraryBookManagement();
		l2.libraryName = "V-cube";
		l2.librianName = "Sanjay";
		l2.bookId = 2;
		l2.bookTitle = "Python";
		l2.authorName="Sai";
		l2.availableCopies = 20;
		
		System.out.println("********Book2***********");
		l1.displayLibraryDetails();
		l1.displayBookDetails();
		

		LibraryBookManagement l3 = new LibraryBookManagement();
		l3.libraryName = "V-cube";
		l3.librianName = "Prashanth";
		l3.bookId = 2;
		l3.bookTitle = "DA";
		l3.authorName="Venkat";
		l3.availableCopies = 30;
		l3.displayLibraryDetails();
		l3.displayBookDetails();
		
		System.out.println("********AFTER CHANGING***********");
		l3.changeLibraryDetails("v-cube");	
	}

}
