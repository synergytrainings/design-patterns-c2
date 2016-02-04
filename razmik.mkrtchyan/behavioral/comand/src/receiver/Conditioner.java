package receiver;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public class Conditioner {

    private Speed speed;
    private String firm;
    private String location;

    public Conditioner(String firm, String location) {
        this.firm = firm;
        this.location = location;
        this.speed = Speed.OFF;
    }

    public Speed getSpeed() {
        return speed;
    }

    public String getFirm() {
        return firm;
    }

    public String getLocation() {
        return location;
    }

    public void high() {
        this.speed = Speed.HIGH;
    }

    public void low() {
        this.speed = Speed.LOW;
    }

    public void medium() {
        this.speed = Speed.MEDIUM;
    }

    public void off() {
        this.speed = Speed.OFF;
    }
}
