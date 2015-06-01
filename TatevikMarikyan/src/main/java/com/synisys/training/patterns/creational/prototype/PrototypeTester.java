package com.synisys.training.patterns.creational.prototype;

import com.synisys.training.patterns.creational.prototype.domain.Journal;
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

        Journal journal2 = LibraryManager.get("journal2");
        journal2.setNumber("2015-04");
        journal2.setName("journal4");
        LibraryManager.put("journal2", journal2);
        System.out.println(currentReadingJournals.toString());

    }
}
