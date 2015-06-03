package singletonPattern.test;

import singletonPattern.domain.Book;
import singletonPattern.domain.LibraryEnum;
import singletonPattern.domain.LibraryInitializationHolder;
import singletonPattern.domain.LibraryLazy;

/**
 * Created by TikSat on 04.06.2015.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        Book book1 = new Book(100010, 10, "Book 1 name");
        Book book2 = new Book(100010, 10, "Book 2 name");
        Book book3 = new Book(100010, 10, "Book 3 name");

        //    Enum demonstration
        LibraryEnum library = LibraryEnum.INSTANCE;
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.findBook(book1);

        //   Lazy demonstration
        LibraryLazy libraryLazy = LibraryLazy.getInstance();
        libraryLazy.addBook(book1);
        libraryLazy.findBook(book1);

        //  Initialization-on-demand holder demonstration
        LibraryInitializationHolder initializationHolder = LibraryInitializationHolder.getInstance();
        initializationHolder.addBook(book2);
        initializationHolder.findBook(book2);

    }


}
