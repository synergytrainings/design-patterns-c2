package state.domain.states;

import state.domain.Player;

public class DeadState implements PlayerState {

    @Override
    public void action(Player p) {
        p.dead();
    }
}