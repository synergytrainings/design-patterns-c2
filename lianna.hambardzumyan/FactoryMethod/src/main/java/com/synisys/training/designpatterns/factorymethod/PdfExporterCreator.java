package com.synisys.training.designpatterns.factorymethod;

public class PdfExporterCreator extends ExporterCreator {

	@Override
	public Exporter createExporter() {
		return new PdfExporter();
	}

}
