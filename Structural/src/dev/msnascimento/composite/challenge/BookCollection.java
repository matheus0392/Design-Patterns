package dev.msnascimento.composite.challenge;

import java.util.ArrayList;

public class BookCollection implements Book{

  private ArrayList<Book> book = new ArrayList();
  private ArrayList<FictionBook> fictionBooks = new ArrayList();

  public void addBook(Book book) {
	  this.book.add(book);
  }

  public void addFictionBook(FictionBook fictionBook) {
    fictionBooks.add(fictionBook);
  }

  public void checkout() {
	  this.book.forEach(Book::checkout);
    fictionBooks.forEach(FictionBook::checkout);
  }

  public void returnBook() {
	  this.book.forEach(Book::returnBook);
    fictionBooks.forEach(FictionBook::returnBook);
  }


}
