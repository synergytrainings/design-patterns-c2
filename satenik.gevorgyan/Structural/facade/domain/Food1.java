package facade.domain;

import java.util.Calendar;
import java.util.Date;


public class Food1 implements Food{
private String foodName  = "pizza";
    @Override
    public Time getMakeTime() {
        return new Time(1,20);
    }

    public String getFoodName() {
        return foodName;
    }
}
