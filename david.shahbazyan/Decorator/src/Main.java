/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/23/15 <br/>
 * <b>Time:</b> 1:07 PM <br/>
 */
public class Main {
    public static void main(String[] args) {
        Popup popupDecorator = new Popup(new OutputLabel("Some message goes here..."));
        popupDecorator.show();
        popupDecorator.hide();

        MinimizablePopup minimizablePopupDecorator = new MinimizablePopup(popupDecorator);
        minimizablePopupDecorator.show();
        minimizablePopupDecorator.minimize();
        minimizablePopupDecorator.restore();
        minimizablePopupDecorator.hide();
    }
}
