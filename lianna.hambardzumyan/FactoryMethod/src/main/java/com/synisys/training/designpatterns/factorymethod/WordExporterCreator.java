package com.synisys.training.designpatterns.factorymethod;

public class WordExporterCreator extends ExporterCreator {

	@Override
	public Exporter createExporter() {
		return new WordExporter();
	}

}
