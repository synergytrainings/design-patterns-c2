package com.synisys.training.patterns.creational.prototype.domain;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public class Book extends LibraryItemImpl {

    private String author;

    public Book(String name) {
        super(name);
    }

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Book clone() throws CloneNotSupportedException{
        Book clone = (Book) super.clone();
        clone.author = this.author;
        return clone;
    }

    @Override
    public String toString() {
        return "[Book name: " + getName() + ", Book author: " + this.author + "]";
    }
}
