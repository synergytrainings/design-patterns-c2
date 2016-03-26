import impl.Channel;
import impl.Client;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public class Main {
    public static void main(String[] args) {
        AtomicInteger channelUID = new AtomicInteger(0);
        AtomicInteger clientUID = new AtomicInteger(0);

        List<Channel> channels = Arrays.asList(
                new Channel(channelUID.incrementAndGet()),
                new Channel(channelUID.incrementAndGet())
        );

        for (Channel channel : channels) {
            for (int i = 0; i < 5; i++) {
                channel.addClient(new Client(clientUID.incrementAndGet()));
            }
        }

        Channel randomChannel = channels.get(((int) (Math.random() * 2)));
        Client randomClient = randomChannel.getClients().get(((int) (Math.random() * 5)));
        randomChannel.sendMessage(randomClient, "My message to all clients of " + randomChannel.getChannelName() + " channel...");
    }
}
