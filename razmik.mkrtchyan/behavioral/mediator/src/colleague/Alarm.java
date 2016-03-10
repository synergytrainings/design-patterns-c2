package colleague;

import mediator.EventMediator;
import mediator.EventType;

import java.time.LocalDateTime;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Mar 03, 2016.
 *  
 */
public class Alarm extends Colleague {

    private LocalDateTime lastAlarmDate;

    public Alarm(EventMediator mediator) {
        super(mediator);
    }

    @Override
    public void onEvent() {
        mediator.onEvent(this, EventType.ALARM);
    }

    @Override
    public void action() {
        System.out.println("alarm");
    }

    public void setLastAlarmDate(LocalDateTime lastAlarmDate) {
        this.lastAlarmDate = lastAlarmDate;
    }

    public LocalDateTime getLastAlarmDate() {
        return lastAlarmDate;
    }

    public boolean getIsHaveLessThanOneHour() {
        //some logic with lastAlarmDate
        return false;
    }
}
