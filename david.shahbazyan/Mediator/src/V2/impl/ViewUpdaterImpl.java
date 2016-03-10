package V2.impl;

import java.util.ArrayList;
import java.util.List;

import V2.api.View;
import V2.api.ViewUpdater;

/**
 * @author David.Shahbazyan
 * @since Mar 03, 2016
 */
public class ViewUpdaterImpl implements ViewUpdater {
    private List<View> availableViews = new ArrayList<>();

    @Override public void add(View view) {
        this.availableViews.add(view);
    }

    @Override public void addAll(List<View> view) {
        this.availableViews.addAll(view);
    }

    @Override public void remove(View view) {
        this.availableViews.remove(view);
    }

    @Override public List<View> getAvailableViews() {
        return this.availableViews;
    }

    @Override public void updateView(View view) {
        if (view != null) {
            view.invalidateView();
        } else {
            for (View availableView : availableViews) {
                availableView.invalidateView();
            }
        }
    }
}
