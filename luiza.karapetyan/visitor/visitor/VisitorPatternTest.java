package com.synisys.de.rwandaIngo.visitor;

/**
 * Created by Luiza.Karapetyan on 3/31/2016.
 */
public class VisitorPatternTest {
    public static void main(String[] args) {
        FileSystemObject root =  new Directory("root",
                new File("file1.txt", 100),
                new Directory("dir1",
                        new File("dir1_file1.txt", 200),
                        new File("dir1_file2.txt", 200)),
                new File("file2.txt", 400));
        SizeCalculationVisitor visitor = new SizeCalculationVisitor();
        visitor.dispatchVisit(root);
    }
}
