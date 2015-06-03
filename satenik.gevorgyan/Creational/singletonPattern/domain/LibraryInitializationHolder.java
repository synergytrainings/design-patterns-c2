package singletonPattern.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TikSat on 04.06.2015.
 */
public class LibraryInitializationHolder {

    private List<Book> libraryBookList = new ArrayList<Book>();

    public static class LibraryHolder{
        private static final LibraryInitializationHolder INSTANCE = new LibraryInitializationHolder();
    }

    public static LibraryInitializationHolder getInstance(){
        return LibraryHolder.INSTANCE;
    }

    public void findBook(Book book){
        System.out.println("Print found book details");
    }

    public void addBook(Book book){
        System.out.println("Added new book " + book.getName());

    }
}
