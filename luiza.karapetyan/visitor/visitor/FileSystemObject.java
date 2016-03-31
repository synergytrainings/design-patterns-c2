package com.synisys.de.rwandaIngo.visitor;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public interface FileSystemObject extends
        Visitable<FileSystemVisitor, FileSystemObject> {

    String getName();

}