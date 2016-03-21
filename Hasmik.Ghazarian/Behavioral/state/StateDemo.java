package behavioral.state;

import java.time.LocalDateTime;

/**
 * Created by Hasmik.Ghazaryan on 3/21/2016.
 */
public class StateDemo {

    public static void main(String[] args) {
        StateContext sc = new StateContext();
        if(LocalDateTime.now().getHour() < 2 || LocalDateTime.now().getHour() > 6){
            sc.changeColor("TrafficMode");
        } else {
            sc.changeColor("NoTrafficMode");
        }
    }
}
