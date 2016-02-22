package flyweight;


public class FlyweightPatternDemo {

    public static void main(String[] args) {

        int holidaysCount;
        Holiday holiday;
        for(holidaysCount=0; holidaysCount < 15; ++holidaysCount) {
            holiday = new Holiday();
            Suitcase bag = (Suitcase)BagFactory.getSuitcase(getRandomWeight());
            bag.setX(getRandomX());
            bag.setY(getRandomY());
            bag.setZ(getRandomZ());
            holiday.setBag(bag);
            holiday.getBag().fill();
        }
    }

    public static Integer getRandomWeight(){
         int weight = (int) (Math.random() * (10 - 1)) + 1;
        return weight;
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    private static int getRandomZ() {
        return (int)(Math.random()*100);
    }
}
