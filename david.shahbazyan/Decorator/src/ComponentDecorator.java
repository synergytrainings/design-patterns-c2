/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/30/15 <br/>
 * <b>Time:</b> 1:16 PM <br/>
 */
public abstract class ComponentDecorator implements Component {
    Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }

    @Override
    public void hide() {
        component.hide();
    }
}
