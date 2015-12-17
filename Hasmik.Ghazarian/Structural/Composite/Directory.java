package com.hasie.CompositePattern;

import java.util.ArrayList;

/**
 * Author: Hasmik Ghazaryan on 6/19/2015.
 */
public class Directory implements AbstractFile {
        private String name;
        private ArrayList<AbstractFile> files = new
                ArrayList<AbstractFile>();
        private Indentation indentation;
        public Directory (String name, Indentation indentation) {
            this.name = name;
            this.indentation = indentation;
        }
    public void add(AbstractFile f) {
        files.add(f);
    }
    public void ls() {
        System.out.println(indentation.getIndentation() + name);
        indentation.increaseIndentation();
        for (AbstractFile file : files) {
            file.ls();
        }
        indentation.decreaseIndentation();
    }
}

