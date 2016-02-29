package main.com.synisys.iterator;

import java.util.List;

/**
 * Created by emil.saghatelyan on 2/29/2016.
 */
public interface Display {

	List<Screen> getScreens();
	void addScreen(Screen screen);
	InvalidScreenIterator iterator();
}
