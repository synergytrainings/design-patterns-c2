package V1;

import java.util.concurrent.atomic.AtomicInteger;

import V1.impl.Channel;
import V1.impl.User;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 1:33 AM <br/>
 */
public class Main {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    public static void main(String[] args) {
        Channel channel = new Channel();
        for (int i = 0; i < 5; i++) {
            channel.addUser(new User(channel, ID_GENERATOR.incrementAndGet(), "User_" + ID_GENERATOR.get()));
        }

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * 5);
            channel.getUsers().get(index).sendMessage(String.format("New message from USER%d", index + 1));
            System.out.println();
        }
    }
}
