package com.synisys.training.patterns.creational.prototype;

import com.synisys.training.patterns.creational.prototype.domain.LibraryItem;
import com.synisys.training.patterns.creational.prototype.domain.LibraryItemImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public class PrototypeTester<T extends LibraryItemImpl> {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<LibraryItem> currentReadingBooks = new ArrayList<>();

        currentReadingBooks.add(LibraryManager.get("book1"));
        currentReadingBooks.add(LibraryManager.get("book3"));
        System.out.println(currentReadingBooks.toString());

        List<LibraryItem> currentReadingJournals = new ArrayList<>();

        currentReadingJournals.add(LibraryManager.get("journal1"));
        currentReadingJournals.add(LibraryManager.get("journal2"));
        System.out.println(currentReadingJournals.toString());

        currentReadingBooks.clear();
        currentReadingJournals.clear();

        System.out.println(LibraryManager.browse().toString());
    }
}
