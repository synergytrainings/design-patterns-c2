package state.domain.states;


import state.domain.Player;

public class SurvivalState implements PlayerState {

    @Override
    public void action(Player p) {
        p.survive();
        p.firePistol();
    }
}