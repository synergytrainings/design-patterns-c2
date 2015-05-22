package com.synisys.training.patterns.creational.factoryMethod.factory;

import com.synisys.training.patterns.creational.factoryMethod.utility.ConvertibleEnum;
import com.synisys.training.patterns.creational.factoryMethod.utility.ReverseEnumMap;
import com.synisys.training.patterns.creational.factoryMethod.product.Exporter;
import com.synisys.training.patterns.creational.factoryMethod.product.ExporterPDF;
import com.synisys.training.patterns.creational.factoryMethod.product.ExporterRTF;

/**
 * @author Tatevik.Marikyan
 * @since 22-May-15.
 */
public enum ExportTypes implements ExporterFactory, ConvertibleEnum<String> {
    PDF("pdf") {
        @Override
        public Exporter getExporter() {
            return new ExporterPDF();
        }



    }, RTF("rtf") {
        @Override
        public Exporter getExporter() {
            return new ExporterRTF();
        }


    };

    private final String key;

    private ExportTypes(String key) {
        this.key = key;
    }

    private static ReverseEnumMap<String, ExportTypes> INSTANCE_FINDER = new ReverseEnumMap<>(ExportTypes.class);

    public static ExportTypes findInstance(String key) {
        return INSTANCE_FINDER.findInstance(key);
    }

    @Override
    public String convert() {
        return key;
    }
}
