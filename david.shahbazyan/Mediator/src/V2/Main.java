package V2;

import java.util.Arrays;

import V2.api.ViewUpdater;
import V2.impl.MainView;
import V2.impl.SubView;
import V2.impl.ViewUpdaterImpl;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 1:33 AM <br/>
 */
public class Main {
    public static void main(String[] args) {
        ViewUpdater viewUpdater = new ViewUpdaterImpl();

        viewUpdater.addAll(Arrays.asList(
                new MainView("MainView", viewUpdater),
                new SubView("SubView1", viewUpdater),
                new SubView("SubView2", viewUpdater),
                new SubView("SubView3", viewUpdater)
        ));

        System.out.println("[ONLY THIS]");
        viewUpdater.getAvailableViews().get(2).updateThis();

        System.out.println();

        System.out.println("[ALL]");
        viewUpdater.getAvailableViews().get(0).updateAll();
    }
}
