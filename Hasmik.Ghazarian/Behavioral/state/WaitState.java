package behavioral.state;

/**
 * Created by Hasmik.Ghazaryan on 3/21/2016.
 */
public class WaitState extends State {

    private String previousState;

    public WaitState(String previousState) {
        this.previousState = previousState;
    }

    public String getPreviousState() {
        return previousState;
    }

    @Override
    public void changeColor(StateContext stateContext, String mode) {
        //change color to yellow
        waitSomeTime(5);
        switch (previousState) {
            case "Stay":
                stateContext.setState(new GoState());
                break;
            case "Go":
                stateContext.setState(new StayState());
                break;
            case "NoTrafficMode":
                stateContext.setState(new WaitState("NoTrafficMode"));
            default:
                throw new IllegalStateException("Wrong State");
        }
    }

}
