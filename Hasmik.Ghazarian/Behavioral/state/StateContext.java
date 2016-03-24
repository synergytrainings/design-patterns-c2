package behavioral.state;

/**
 * Created by Hasmik.Ghazaryan on 3/21/2016.
 */
public class StateContext {

    private State myState;
    public StateContext() {
        setState(new StayState());
    }
    public void setState(State stateName) {
        this.myState = stateName;
    }

    public void changeColor(String mode) {
        this.myState.changeColor(this, mode);
    }
}
