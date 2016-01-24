package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public class OrdinaryWorker extends AbstractTransfer {
	public OrdinaryWorker() {
		super(null);
	}

	public OrdinaryWorker(Transfer nextTransferer) {
		super(nextTransferer);
	}

	@Override
	protected boolean allowedToTransfer(TransferData transferData) {
		return transferData.getAnoint()<1000;
	}

	@Override
	protected void handleTransfer(TransferData transferData) {
		System.out.print("Do transfer");
	}
}
