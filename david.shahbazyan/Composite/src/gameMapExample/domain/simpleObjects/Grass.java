package gameMapExample.domain.simpleObjects;

import gameMapExample.domain.WorldItem;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/19/15 <br/>
 * <b>Time:</b> 1:10 PM <br/>
 */
public class Grass implements WorldItem {
    @Override
    public void draw() {
        System.out.print(" G");
    }
}
