package com.synisys.memento;

/**
 * Created by emil.saghatelyan on 3/7/2016.
 */
public class Game {

	private int playerId;
	private State state;

	public Game(int playerId, State state) {
		this.playerId = playerId;
		this.state = state;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Memento saveState(){
		return new Memento(playerId, state);
	}


	public void restoreState(Object objMemento) {
		Memento memento = (Memento) objMemento;
		this.playerId = memento.playerId;
		this.state = memento.state;
	}


	private class Memento{
		private int playerId;
		private State state;

		private Memento(int playerId, State state) {
			this.playerId = playerId;
			this.state = state;
		}
	}
}
