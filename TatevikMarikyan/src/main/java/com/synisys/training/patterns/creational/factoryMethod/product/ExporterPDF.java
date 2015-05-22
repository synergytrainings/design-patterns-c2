package com.synisys.training.patterns.creational.factoryMethod.product;

/**
 * @author Tatevik.Marikyan
 * @since 22-May-15.
 */
public class ExporterPDF implements Exporter {
    @Override
    public void generate() {
        System.out.println("Generates a document of PDF Type.");
    }
}
