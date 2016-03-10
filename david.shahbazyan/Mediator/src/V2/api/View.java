package V2.api;

/**
 * @author David.Shahbazyan
 * @since Mar 03, 2016
 */
public abstract class View {
    private final String viewName;
    private final ViewUpdater viewUpdater;

    public View(String viewName, ViewUpdater viewUpdater) {
        this.viewName = viewName;
        this.viewUpdater = viewUpdater;
    }

    public String getViewName() {
        return viewName;
    }

    public void updateThis() {
        this.viewUpdater.updateView(this);
    }

    public void updateAll() {
        this.viewUpdater.updateView(null);
    }

    public void invalidateView() {
        System.out.println(String.format("Updating %s view.", getViewName()));
    }
}
