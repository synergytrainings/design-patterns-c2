/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 12:46 PM <br/>
 */
public class OutputLabel implements Component {
    private String msg;

    public OutputLabel(String msg) {
        this.msg = msg;
    }

    @Override
    public void show() {
        System.out.println("Shoes the \"" + msg + "\" message on screen.");
    }

    @Override
    public void hide() {
        System.out.println("Hides the \"" + msg + "\" message from screen.");
    }
}
