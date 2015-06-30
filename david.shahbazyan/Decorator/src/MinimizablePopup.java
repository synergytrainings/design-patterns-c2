/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 12:41 PM <br/>
 */
public class MinimizablePopup extends ComponentDecorator {

    public MinimizablePopup(Component component) {
        super(component);
    }

    public void minimize() {
        System.out.println("Minimized!");
    }

    public void restore() {
        System.out.println("Restored!");
    }
}
