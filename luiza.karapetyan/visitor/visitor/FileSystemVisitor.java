package com.synisys.de.rwandaIngo.visitor;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public interface FileSystemVisitor extends
        Visitor<FileSystemVisitor, FileSystemObject> {

    void visit(File file);

    void visit(Directory directory);

}
