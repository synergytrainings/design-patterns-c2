package main.java;

/**
 * Created by Emil on 1/17/2016.
 */
public class FileProxy implements IFile {

	private User user;
	private String fileName;
	private FileImpl file;

	public FileProxy(String fileName) {
		this.fileName = fileName;

	}

	@Override
	public void performOperation() {
		if (user.isAdmin()) {
			file.performOperation();
		} else {
			System.out.println("You don't have access to this file");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFileName() {
		return fileName;
	}


	public FileImpl getFile() {
		if(file==null){
			file = new FileImpl(fileName);
		}
		return file;
	}


}
