package state;


import state.domain.GameContext;
import state.domain.states.DeadState;
import state.domain.states.HealthyState;
import state.domain.states.SurvivalState;

public class StatePatternDemo {

    public static void main(String[] args) {

        GameContext context = new GameContext();

        context.setState(new HealthyState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new SurvivalState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new DeadState());
        context.gameAction();
        System.out.println("*****");

    }
}
