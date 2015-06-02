package com.synisys.training.patterns.creational.factoryMethod;

import com.synisys.training.patterns.creational.factoryMethod.factory.ExportTypes;

/**
 * @author Tatevik.Marikyan
 * @since 22-May-15.
 */
public class ExportFactoryDemo {

    public static void main(String[] args) {

        ExportTypes.findInstance("pdf").getExporter().generate();
        ExportTypes.findInstance("rtf").getExporter().generate();
    }
}
