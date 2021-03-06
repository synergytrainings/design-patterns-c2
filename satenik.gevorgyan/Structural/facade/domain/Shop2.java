package facade.domain;

import java.util.Date;

public class Shop2  implements Shop {
    Food[] foods;
    @Override
    public void order(Food... orderedFoods) {
        foods = new Food[orderedFoods.length];
    }

    @Override
    public void makeFood() {
        if(foods != null) {
            for (int i = 0; i < foods.length; i++) {
                if (foods[i] != null) {
                    System.out.println("Make "+ foods[i].getFoodName() + " ." );
                }
            }
        }
    }

    @Override
    public String shopName() {
        return "Shop2";
    }

    public Time getOrderTime(){
        Time makeTime = new Time();
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                hour = hour +foods[i].getMakeTime().getHour();
               minute = minute + foods[i].getMakeTime().getMinute();
                // no details time handling of make time
            }

            makeTime.setHour(hour);
            makeTime.setMinute(minute);

            System.out.println("Food make time for " + shopName()+" is " + makeTime + " hour "+ minute +" min .");
        }
        return makeTime;
    }
}
