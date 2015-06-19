package com.hasie.CompositePattern;

/**
 * Author: Hasmik Ghazaryan on 6/19/2015.
 */
public class File implements AbstractFile {
    private String name;
    private Indentation indentation;
    public File(String name, Indentation indentation) {
        this.name = name;
        this.indentation = indentation;
    }
    public void ls() {
        System.out.println(indentation.getIndentation() +
                name);
    }
}

