package main.java;

import java.io.File;

/**
 * Created by Emil on 1/17/2016.
 */
public class FileImpl implements IFile {
	private String fileName;
	private File file;

	public FileImpl(String fileName) {
		this.fileName = fileName;
		file = new File(fileName);

	}

	@Override
	public void performOperation() {

	}
}
