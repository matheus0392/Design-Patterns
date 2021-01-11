package dev.msnascimento.composite.challenge;

public class LibraryClient {

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBook(nonfictionBook);
    bookCollection.addFictionBook(fictionBookOne);
    bookCollection.addFictionBook(fictionBookTwo);

    checkoutBook(nonfictionBook);
    checkoutBook(fictionBookOne);
    checkoutBook(bookCollection);

    returnBook(nonfictionBook);
    returnBook(fictionBookOne);
    returnBook(bookCollection);

  }
  
  public static void checkoutBook(Book book) {
	  book.checkout();
	}


  /*
  public static void checkoutNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.checkout();
  }

  public static void checkoutFictionBook(FictionBook fictionBook) {
    fictionBook.checkout();
  }

  public static void checkoutBookCollection(BookCollection bookCollection) {
    bookCollection.checkout();
  }*/
  
  public static void returnBook(Book book) {
	  book.returnBook();
	}
  
/*
  public static void returnNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.returnBook();
  }

  public static void returnFictionBook(FictionBook fictionBook) {
    fictionBook.returnBook();
  }

  public static void returnBookCollection(BookCollection bookCollection) {
    bookCollection.returnBook();
  }
*/
}
