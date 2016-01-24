package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public class HeadManager extends  AbstractTransfer{

	public HeadManager(Transfer nextTransferer) {
		super(nextTransferer);
	}

	@Override
	protected boolean allowedToTransfer(TransferData transferData) {
		return true;
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
