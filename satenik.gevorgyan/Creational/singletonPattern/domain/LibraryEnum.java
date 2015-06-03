package singletonPattern.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TikSat on 04.06.2015.
 */
public enum LibraryEnum {
    INSTANCE;

    private List<Book> libraryBookList = new ArrayList<Book>();

    public void addNewBookToLibrary(Book newBook){
        this.libraryBookList.add(newBook);
    }

    public void findBook(Book book){
        System.out.println("Print found book details");
    }

    public void addBook(Book book){
        System.out.println("Added new book " + book.getName());

    }
}
