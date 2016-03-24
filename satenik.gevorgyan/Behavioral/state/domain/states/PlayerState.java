package state.domain.states;


import state.domain.Player;

public interface PlayerState {
    void action(Player p);
}