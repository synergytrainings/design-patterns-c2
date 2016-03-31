package com.synisys.de.rwandaIngo.visitor;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public class SizeCalculationVisitor implements FileSystemVisitor {

    private long totalSize = 0;

    @Override
    public void dispatchVisit(FileSystemObject visitable) {
        visitable.accept(this);
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
        System.out.println("Total size = "+totalSize);
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemObject oneChild : directory.getChildren()) {
            oneChild.accept(this);
        }

    }

    public long getTotalSize() {
        return totalSize;
    }

}
