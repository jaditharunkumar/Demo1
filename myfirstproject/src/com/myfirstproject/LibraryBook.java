package com.myfirstproject;

public class LibraryBook {
	
	int bookid;
	String bookName;
	String authorName;
	int availableCopies;
	
	static String libraryName;
	static String librarianName;
	
	void displayBookDetails() {
		
		System.out.println("*********BookDetails**********");
		System.out.println("Book Id : "+bookid);
		System.out.println("BookName : "+bookName);
		System.out.println("AuthorName : "+authorName);
		System.out.println("AvailableCopies : "+availableCopies);
	}
	
	void issueBook(int numberOfBooks) {
	    if (numberOfBooks <= availableCopies) {
	        availableCopies = availableCopies - numberOfBooks;
	    } else {
	        System.out.println("Not enough books available!");
	    }
	}
	
	void displayLibraryDetails() {
		System.out.println("*************LibraryDetails***************");
		System.out.println("LibraryName : "+libraryName);
		System.out.println("LibrarianName : "+librarianName);
	}
	
	void changeLibrarian(String newLibrariean) {
		librarianName = newLibrariean;	
	}
	

	public static void main(String[] args) {
		libraryName = "V-cube";
		librarianName = "Srikanth";
		
		LibraryBook b1 = new LibraryBook();
		LibraryBook b2 = new LibraryBook();
		
		b1.bookid = 101;
		b1.bookName = "Java";
		b1.authorName= "Srikanth";
		b1.availableCopies = 10;
		
		b2.bookid = 102;
		b2.bookName = "SQL";
		b2.authorName= "Vishwa";
		b2.availableCopies = 10;
		
	
		b1.displayLibraryDetails();
		b1.displayBookDetails();
		
		
		b2.displayLibraryDetails();
		b2.displayBookDetails();
		
		b1.issueBook(3);
		b2.issueBook(2);
		
		b1.changeLibrarian("Prakash");
		b1.displayLibraryDetails();
		b1.displayBookDetails();
		
		b1.bookid = 103;
		b1.bookName = "Java";
		b1.authorName= "Srikanth";
		b1.availableCopies = 10;
			
		
	}

}
