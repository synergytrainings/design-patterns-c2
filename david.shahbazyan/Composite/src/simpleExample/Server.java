package simpleExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/23/15 <br/>
 * <b>Time:</b> 3:39 AM <br/>
 */
public class Server {
    private List<Client> clients;
    private Random random = new Random();

    public Server(boolean generateClientsList) {
        if (generateClientsList) {
            generateClientsList();
        }
    }

    public void generateClientsList() {
        int clientsNumber = random.nextInt(3);
        this.clients = new ArrayList<>(clientsNumber);
        for (int i = 0; i < clientsNumber; i++) {
            this.clients.add(new ClientImpl(0, random.nextInt(4)));
        }
    }

    public void printClients() {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
//            System.out.print("+");
//            for (int j = 0; j < lvl; j++) {
//                System.out.print("--");
//            }
            System.out.print("Client LVL: " + client.getLvl() + ", No. " + Integer.valueOf(i + 1));
            System.out.print("\n");
            client.printChildren();
        }
    }
}
