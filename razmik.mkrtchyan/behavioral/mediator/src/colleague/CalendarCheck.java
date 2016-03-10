package colleague;

import mediator.EventType;
import mediator.EventMediator;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Mar 03, 2016.
 *  
 */
public class CalendarCheck extends Colleague {
    public CalendarCheck(EventMediator mediator) {
        super(mediator);
    }

    @Override
    public void onEvent() {
        mediator.onEvent(this, EventType.CALENDAR_CHECKING);
    }

    @Override
    public void action() {

    }

    public boolean isWeekend() {
        Calendar calendar = new GregorianCalendar();
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        return weekDay == Calendar.SATURDAY || weekDay == Calendar.SUNDAY;
    }
}
