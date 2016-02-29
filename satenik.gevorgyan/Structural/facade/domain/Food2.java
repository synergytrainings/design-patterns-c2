package facade.domain;


public class Food2 implements Food{
    private String foodName = "pasta";
    @Override
    public Time getMakeTime() {
        return new Time(0,30);
    }

    public String getFoodName() {
        return foodName;
    }
}
