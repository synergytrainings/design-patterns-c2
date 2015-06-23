package simpleExample;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/23/15 <br/>
 * <b>Time:</b> 3:00 AM <br/>
 */
public class Main {
    public static final int TREE_MAX_DEPTH = 3;

    public static List<Server> servers = new ArrayList<>();

    public static void main(String[] args) {
//        List<Server> servers = new ArrayList<>();
        servers.add(new Server(true));

        for (Server server : servers) {
            server.printClients();
        }
    }
}
