package example;

import java.math.BigDecimal;

/**
 * Created by Luiza.Karapetyan on 5/19/2015.
 */
public class BuilderPattern {

	private StringBuilder message = new StringBuilder();

	public NotificationMessage bringMessage(Integer availableAccount) {
		return new NotificationMessage(availableAccount);
	}

	public class NotificationMessage {

		private NotificationMessage(Integer availableAccount) {
			message.append("Your available Account is ");
			message.append(availableAccount);
			message.append(" dram.");
		}

		public Provider provider(String... names) {
			return new Provider(names);
		}

	}

	public class Provider {

		private Provider(String... names) {
			message.append("You can communicate with ");
            for (String name : names) {
                message.append(name).append(',');
            }
            message.deleteCharAt(message.length() - 1);
			message.append(" ");
			message.append("subscribers ");

		}

		public Duration duration(BigDecimal time) {
			return new Duration(time);
		}

	}

	public class Duration {

		private Duration(BigDecimal time) {
			message.append(time);
			message.append(" ");
			message.append("minute");
		}

		public BringMessage build() {
			return new BringMessage(message.toString());
		}

	}

}
