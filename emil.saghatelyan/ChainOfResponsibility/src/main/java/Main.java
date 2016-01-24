package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Transfer headManager = new OrdinaryWorker();
		Transfer manager = new OrdinaryWorker(headManager);
		Transfer ordinary = new OrdinaryWorker(manager);

		ordinary.transfer(new TransferData(50000,new User(), new User()));

	}

}

