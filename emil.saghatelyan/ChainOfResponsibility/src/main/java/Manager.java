package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public class Manager extends AbstractTransfer {

	public Manager(Transfer nextTransferer) {
		super(nextTransferer);
	}

	@Override
	protected boolean allowedToTransfer(TransferData transferData) {
		return transferData.getAnoint()<100000;
	}

	@Override
	protected void handleTransfer(TransferData transferData) {
		doSomeChecksWithUser();
		System.out.print("Do transfer");
	}

	private void doSomeChecksWithUser(){

		System.out.print("Do checks");
	}
}
