package gameMapExample;

import gameMapExample.domain.WorldItem;
import gameMapExample.domain.compositeObjects.ForestItem;
import gameMapExample.domain.simpleObjects.Grass;
import gameMapExample.domain.simpleObjects.Sand;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/19/15 <br/>
 * <b>Time:</b> 1:03 PM <br/>
 */
public class Main {
    private static WorldItem[][] worldMap = new WorldItem[10][10];

    public static void main(String[] args) {
        System.out.println("New world generation...");
        drawMeadow(1, 1, 3, 10);
        drawCoast(4, 1, 10, 4);
        drawForest(4, 4, 10, 10);
        printWorldMap(worldMap);
        System.out.println("New world generation completed successfully.");
    }

    private static void printWorldMap(WorldItem[][] worldMap) {
        for (WorldItem[] worldItems : worldMap) {
            for (WorldItem worldItem : worldItems) {
                worldItem.draw();
            }
            System.out.print('\n');
        }
    }

    private static void drawForest(int iFrom, int jFrom, int iTo, int jTo) {
        if (iFrom > 0 && iFrom <= worldMap.length && iTo > 0 && iTo <= worldMap.length) {
            for (int i = iFrom - 1; i < iTo; i++) {
                if (jFrom > 0 && jFrom <= worldMap[i].length && jTo > 0 && jTo <= worldMap[i].length) {
                    for (int j = jFrom - 1; j < jTo; j++) {
                        worldMap[i][j] = new ForestItem();
                    }
                }
            }
        }
    }

    private static void drawCoast(int iFrom, int jFrom, int iTo, int jTo) {
        if (iFrom > 0 && iFrom <= worldMap.length && iTo > 0 && iTo <= worldMap.length) {
            for (int i = iFrom - 1; i < iTo; i++) {
                if (jFrom > 0 && jFrom <= worldMap[i].length && jTo > 0 && jTo <= worldMap[i].length) {
                    for (int j = jFrom - 1; j < jTo; j++) {
                        worldMap[i][j] = new Sand();
                    }
                }
            }
        }
    }

    private static void drawMeadow(int iFrom, int jFrom, int iTo, int jTo) {
        if (iFrom > 0 && iFrom <= worldMap.length && iTo > 0 && iTo <= worldMap.length) {
            for (int i = iFrom - 1; i < iTo; i++) {
                if (jFrom > 0 && jFrom <= worldMap[i].length && jTo > 0 && jTo <= worldMap[i].length) {
                    for (int j = jFrom - 1; j < jTo; j++) {
                        worldMap[i][j] = new Grass();
                    }
                }
            }
        }
    }
}
