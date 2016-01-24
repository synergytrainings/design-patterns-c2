package main.java;

/**
 * Created by Emil on 1/25/2016.
 */
public class TransferData {
	private double anoint;
	private User fromUser;
	private User toUser;

	public TransferData(double anoint, User fromUser, User toUser) {
		this.anoint = anoint;
		this.fromUser = fromUser;
		this.toUser = toUser;
	}

	public double getAnoint() {
		return anoint;
	}

	public void setAnoint(double anoint) {
		this.anoint = anoint;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public User getToUser() {
		return toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
}
