package gameMapExample.domain.simpleObjects;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/19/15 <br/>
 * <b>Time:</b> 1:05 PM <br/>
 */
public class Trunk {
    private int width;
    private int height;

    public Trunk(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
