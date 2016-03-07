package mediator;

import colleague.Alarm;
import colleague.CalendarCheck;
import colleague.Colleague;

import java.time.LocalDateTime;
import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Razmik on 3/2/2016.
 */
public class EventMediator {

    private Map<EventType, Colleague> colleagueMap = new EnumMap<>(EventType.class);

    public void addColleague(Colleague colleague, EventType type) {
        colleagueMap.put(type, colleague);
    }

    public void onEvent(Colleague colleague, EventType eventType) {
        checkExisting(colleague, eventType);
        switch (eventType) {
            case CALENDAR_CHECKING:
                if (!((CalendarCheck) colleague).isWeekend()) {
                    colleagueMap.get(EventType.ALARM).onEvent();
                } else {
                    colleagueMap.get(EventType.COFFEE_POT).onEvent();
                }
                break;
            case ALARM:
                if (!((CalendarCheck) colleagueMap.get(EventType.CALENDAR_CHECKING)).isWeekend()) {
                    Alarm alarm = (Alarm) colleague;
                    alarm.action();
                    alarm.setLastAlarmDate(LocalDateTime.now());
                    if (!alarm.getIsHaveLessThanOneHour()) {
                        colleagueMap.get(EventType.COFFEE_POT).onEvent();
                    }
                }
                break;
            case COFFEE_POT:
                if (!((CalendarCheck) colleagueMap.get(EventType.CALENDAR_CHECKING)).isWeekend()) {
                    colleague.action();
                }
                break;
        }
    }

    private void checkExisting(Colleague colleague, EventType eventType) {
        if (colleagueMap.get(eventType) == null) {
            throw new UnsupportedOperationException("The colleague does not exists");
        }
    }
}
