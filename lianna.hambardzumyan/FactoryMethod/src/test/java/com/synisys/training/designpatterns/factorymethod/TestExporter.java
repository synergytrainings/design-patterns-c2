package com.synisys.training.designpatterns.factorymethod;

import java.io.File;

public class TestExporter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		export(new PdfExporterCreator());
		export(new WordExporterCreator());

	}
	
	//client
	public static File export(ExporterCreator exporterCreator) {
		return exporterCreator.getExporter().export(System.in);
	}

}
