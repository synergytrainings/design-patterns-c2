package simpleExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/23/15 <br/>
 * <b>Time:</b> 3:16 AM <br/>
 */
public class ClientImpl extends Client {
    private int lvl;
    private List<Client> children;
    private Random random = new Random();

    public ClientImpl(int level, int numberOfChildren) {
        this.lvl = level;
        this.children = new ArrayList<>();
        if (lvl != Main.TREE_MAX_DEPTH) {
            for (int i = 0; i < numberOfChildren; i++) {
                children.add(new ClientImpl(level + 1, random.nextInt(4)));
            }
        }
    }

    @Override
    public void printChildren() {
        if (children.size() > 0) {
            if (lvl > 0) {
                System.out.print("|");
            }
            for (int i = 0; i < lvl; i++) {
                System.out.print("\t");
            }
            for (int i = 0; i < children.size(); i++) {
                Client child = children.get(i);
                System.out.print("+");
    //            for (int j = 0; j < lvl; j++) {
                    System.out.print("--");
    //            }
                System.out.print("Client LVL: " + child.getLvl() + ", No. " + Integer.valueOf(i + 1));
                System.out.print('\n');
                child.printChildren();
            }
        }
    }

    @Override
    public int getLvl() {
        return lvl;
    }
}
