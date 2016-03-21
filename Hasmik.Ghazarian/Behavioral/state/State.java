package behavioral.state;

/**
 * Created by Hasmik.Ghazaryan on 3/21/2016.
 */
public abstract class State {
    public abstract void changeColor(StateContext stateContext, String mode);

    protected void waitSomeTime(Integer cu){
        //implementation
    }
}
