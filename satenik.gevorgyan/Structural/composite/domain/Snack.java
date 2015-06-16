package structral.composite.domain;

/**
 * Created by TikSat on 16.06.2015.
 */
public class Snack implements Meal {
    // here must be some difference :)

    private double price;

    public Snack(double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return "Snack";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
