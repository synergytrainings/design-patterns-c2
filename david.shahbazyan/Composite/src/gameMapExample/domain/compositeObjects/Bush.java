package gameMapExample.domain.compositeObjects;

import gameMapExample.domain.WorldItem;
import gameMapExample.domain.simpleObjects.Leaf;
import gameMapExample.domain.simpleObjects.Trunk;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/19/15 <br/>
 * <b>Time:</b> 1:07 PM <br/>
 */
public class Bush implements WorldItem {
    private List<Leaf> leafs = new ArrayList<>();
    private Trunk trunk;

    public Bush(int tWidth, int tHeight, int leafCount) {
        trunk = new Trunk(tWidth, tHeight);
        for (int i = 0; i < leafCount; i++) {
            this.leafs.add(new Leaf());
        }
    }

    @Override
    public void draw() {
        System.out.print(" B");
    }
}
