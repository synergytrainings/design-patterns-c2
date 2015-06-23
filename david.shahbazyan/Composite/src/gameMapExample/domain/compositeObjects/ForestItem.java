package gameMapExample.domain.compositeObjects;

import gameMapExample.domain.WorldItem;

import java.util.Random;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/19/15 <br/>
 * <b>Time:</b> 1:07 PM <br/>
 */
public class ForestItem implements WorldItem {
    private WorldItem forestItem;
    private Random random = new Random();

    public ForestItem() {
        if (random.nextInt() % 2 == 0) {
            this.forestItem = new Tree(5, 10, 50);
        } else {
            this.forestItem = new Bush(3, 5, 60);
        }
    }

    @Override
    public void draw() {
        this.forestItem.draw();
    }
}
