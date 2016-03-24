package state.domain.states;


import state.domain.Player;

public class HealthyState implements PlayerState {

    @Override
    public void action(Player p) {
        p.attack();
        p.fireBumb();
        p.fireGunblade();
        p.fireLaserPistol();
    }
}