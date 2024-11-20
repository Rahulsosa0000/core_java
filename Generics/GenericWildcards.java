package com.Generics;

// generics wildcards (?) add flexibility to work with unknown types in generic classes, methods, and interfaces.
/*
 * 1. Unbound WildCard: - all  type accept method level- type changes 
 * 2. UpperBound WildCard: - accept only sub class and read data 
 * 3. LowerBound Wild Card: - accept only Super class and read and modify data 
 */



import java.util.ArrayList;
import java.util.List;

class Book{
	private String title;
	
	public Book(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
		
	}
}

class FictionBook extends Book{

	public FictionBook(String title) {
		super(title);
		
	}
	
}

class ScienceBook extends Book{

	public ScienceBook(String title) {
		super(title);
	}
	
}



public class GenericWildcards {
	  // Unbounded Wildcard: Accept any type of book list  
	public static void printBookTitles(List<?> books) {
		System.out.println("Book Title:");
		for(Object book : books) {
			System.out.println(((Book) book).getTitle());
		}
	}
	 // Upper-Bounded Wildcard: Accept lists of Book or any subclass of Book
	
	public static void printSpecificBooks(List<? extends Book> books) {
        System.out.println("Specific Books:");
		for(Book book: books) {
			System.out.println(book.getTitle());
		//? extends Book allows you to read items as Book, but not add any item to the list, 
			//as the list could be of any subtype of Book.
		}
	}
    // Lower-Bounded Wildcard: Accept lists of FictionBook or any superclass (like Book or Object)
	
	public static void addFictionBooks(List<? super FictionBook> books) {
		books.add(new FictionBook("The great Gatsby"));
		books.add(new FictionBook("1984"));
	}
	public static void addScienceBooks(List<? super ScienceBook> books) {
		books.add(new ScienceBook("Java"));
		books.add(new ScienceBook("Ds"));
	}
	
	
	public static void main(String[] args) {
		
		List<FictionBook> fictionBooks=new ArrayList<FictionBook>();
		fictionBooks.add(new FictionBook("To Kill a Mockingbird"));

		List<ScienceBook> scienceBooks = new ArrayList<>();
        scienceBooks.add(new ScienceBook("A Brief History of Time"));

        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book("Generic Book"));

        // Using unbounded wildcard: can print any type of book list
        printBookTitles(fictionBooks);
        printBookTitles(scienceBooks);
        System.out.println("_______________________________________________");
        
        // Using upper-bounded wildcard: can print list of Book or any subclass
        printSpecificBooks(fictionBooks);
        printSpecificBooks(scienceBooks);
        System.out.println("_______________________________________________");
        
        // Using lower-bounded wildcard: can add FictionBook to lists of FictionBook or superclass
        addFictionBooks(allBooks);
        
        addFictionBooks(fictionBooks); // Works because fictionBooks is a List<FictionBook>
        addScienceBooks(allBooks);
        addScienceBooks(scienceBooks);
        System.out.println("\nAll Books after adding fiction:");
        printBookTitles(allBooks);
        
        //printSpecificBooks(scienceBooks);

		
		
	}

}
