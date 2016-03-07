package com.synisys.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emil.saghatelyan on 3/7/2016.
 */
public class GameCaretaker {
	private List<Object> mementoList = new ArrayList<Object>();

	public void addMemento(Object state) {
		mementoList.add(state);
	}

	public Object getMemento(int index) {
		return mementoList.get(index);
	}


}
