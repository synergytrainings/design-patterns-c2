package com.synisys.memento;

/**
 * Created by emil.saghatelyan on 3/7/2016.
 */
public class State {
	private int level;
	private int position;

	public State(int level, int position) {
		this.level = level;
		this.position = position;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
