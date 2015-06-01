package com.synisys.training.patterns.creational.prototype;

import com.synisys.training.patterns.creational.prototype.domain.Book;
import com.synisys.training.patterns.creational.prototype.domain.Journal;
import com.synisys.training.patterns.creational.prototype.domain.LibraryItem;
import com.synisys.training.patterns.creational.prototype.domain.LibraryItemImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public class LibraryManager {

    private static Map<String, LibraryItem> library = new HashMap<>();

    static {
        library.put("book1", new Book("book1", "author1"));
        library.put("book2", new Book("book2", "author2"));
        library.put("book3", new Book("book3", "author3"));
        library.put("journal1", new Journal("journal1", "2015-01"));
        library.put("journal2", new Journal("journal2", "2015-02"));
        library.put("journal3", new Journal("journal3", "2015-03"));
    }

    public static <T extends LibraryItem> T get(String name) throws CloneNotSupportedException {
        return (T) library.get(name);
    }

    public static <T extends LibraryItem> T put(String name, T libraryItem) {
        return (T) library.put(name, libraryItem);
    }

    public static Collection<LibraryItem> browse() {
        return library.values();
    }
}
