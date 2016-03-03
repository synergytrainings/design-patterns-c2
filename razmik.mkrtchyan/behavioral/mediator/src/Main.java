import colleague.Alarm;
import colleague.CalendarCheck;
import colleague.CoffeePot;
import mediator.EventMediator;
import mediator.EventType;

public class Main {

    public static void main(String[] args) {
        EventMediator eventMediator = new EventMediator();
        Alarm alarm = new Alarm(eventMediator);
        CalendarCheck calendar = new CalendarCheck(eventMediator);
        CoffeePot coffeePot = new CoffeePot(eventMediator);
        eventMediator.addColleague(alarm, EventType.ALARM);
        eventMediator.addColleague(calendar, EventType.CALENDAR_CHECKING);
        eventMediator.addColleague(coffeePot, EventType.COFFEE_POT);
        alarm.onEvent();
        calendar.onEvent();
        coffeePot.onEvent();
    }
}
