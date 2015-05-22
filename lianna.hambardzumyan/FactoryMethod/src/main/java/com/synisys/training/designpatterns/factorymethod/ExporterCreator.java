package com.synisys.training.designpatterns.factorymethod;



public abstract class ExporterCreator {
	public abstract Exporter createExporter();
	
	public Exporter getExporter() {
		Exporter exporter = createExporter();
		//some other things with exporter
		return exporter;
	}
}
