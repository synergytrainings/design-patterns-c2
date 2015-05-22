package com.synisys.training.patterns.creational.factoryMethod.factory;

import com.synisys.training.patterns.creational.factoryMethod.product.Exporter;

/**
 * @author Tatevik.Marikyan
 * @since 22-May-15.
 */
public interface ExporterFactory {

    Exporter getExporter();
}
