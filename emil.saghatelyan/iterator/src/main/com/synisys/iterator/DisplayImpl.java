package main.com.synisys.iterator;

import java.util.List;

/**
 * Created by emil.saghatelyan on 2/29/2016.
 */
public class DisplayImpl
		implements Display {
	private List<Screen> screens;

	public DisplayImpl(List<Screen> screens) {
		this.screens = screens;
	}

	@Override
	public List<Screen> getScreens() {
		return screens;
	}

	@Override
	public void addScreen(Screen screen) {
		this.screens.add(screen);
	}

	@Override
	public InvalidScreenIterator iterator() {
		return new InvalidScreenIteratorImpl();
	}

	public class InvalidScreenIteratorImpl
			implements InvalidScreenIterator<Screen> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			while (index < screens.size()) {
				if (!screens.get(index).isValid()) {
					return true;
				}
				else {
					index++;
				}
			}
			return false;
		}

		@Override
		public Screen next() {
			return screens.get(index++);
		}
	}

}
