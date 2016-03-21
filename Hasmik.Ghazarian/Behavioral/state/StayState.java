package behavioral.state;

/**
 * Created by Hasmik.Ghazaryan on 3/21/2016.
 */
public class StayState extends State {

    @Override
    public void changeColor(StateContext stateContext, String mode) {
        //change color to red
        waitSomeTime(20);
        switch (mode) {
            case "TrafficMode":
                stateContext.setState(new WaitState("Stay"));
                break;
            case "NoTrafficMode":
                stateContext.setState(new WaitState(mode));
                break;
            default:
                throw new IllegalStateException("Wrong State");
        }
    }
}
