package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public abstract class AbstractTransfer implements Transfer {
	private Transfer nextTransferer;

	public AbstractTransfer(Transfer nextTransferer){
		this.nextTransferer=nextTransferer;
	}

	@Override
	public void transfer(TransferData transferData) {
		if (allowedToTransfer(transferData)) {
			handleTransfer(transferData);
		} else if (nextTransferer != null) {
			nextTransferer.transfer(transferData);
		}
	}

	protected abstract boolean allowedToTransfer(TransferData transferData);

	protected abstract void handleTransfer(TransferData transferData);

	public Transfer getNextTransferer() {
		return nextTransferer;
	}

	public void setNextTransferer(Transfer nextTransferer) {
		this.nextTransferer = nextTransferer;
	}
}
