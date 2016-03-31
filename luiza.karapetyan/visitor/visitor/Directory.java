package com.synisys.de.rwandaIngo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public class Directory implements FileSystemObject {

    private List<FileSystemObject> children = new ArrayList<FileSystemObject>();
    protected String name;

    public Directory(String name, FileSystemObject... children) {
        this.name = name;

        for (FileSystemObject fso : children) {
            this.children.add(fso);
        }
    }

    public List<FileSystemObject> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

}
