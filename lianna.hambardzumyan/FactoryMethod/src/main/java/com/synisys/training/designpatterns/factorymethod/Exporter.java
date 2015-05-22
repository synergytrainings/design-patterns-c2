package com.synisys.training.designpatterns.factorymethod;

import java.io.File;
import java.io.InputStream;

public interface Exporter {
	public File export(InputStream xml);
}
