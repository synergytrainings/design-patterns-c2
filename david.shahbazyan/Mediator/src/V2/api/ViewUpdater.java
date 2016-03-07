package V2.api;

import java.util.List;

/**
 * @author David.Shahbazyan
 * @since Mar 03, 2016
 */
public interface ViewUpdater {
	void add(View view);

	void addAll(List<View> view);

	void remove(View view);

	List<View> getAvailableViews();

	void updateView(View view);
}
