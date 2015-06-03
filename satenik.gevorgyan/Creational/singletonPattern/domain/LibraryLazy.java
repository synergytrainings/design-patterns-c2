package singletonPattern.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TikSat on 04.06.2015.
 */
public class LibraryLazy {
    private static volatile LibraryLazy instance;

    private List<Book> libraryBookList = new ArrayList<Book>();

    private LibraryLazy(){}

    public static synchronized LibraryLazy getInstance(){
        if(instance == null){
        instance = new LibraryLazy();
        }
        return instance;
    }

    public void findBook(Book book){
        System.out.println("Print found book details");
    }

    public void addBook(Book book){
        System.out.println("Added new book " + book.getName());

    }
}
