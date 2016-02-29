package flyweight;


public class Holiday {
    private Bag bag;


    public Holiday() {
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
