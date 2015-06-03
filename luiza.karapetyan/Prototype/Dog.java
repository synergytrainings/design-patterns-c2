package prototype;

/**
 * Created by Luiza.Karapetyan on 6/2/15.
 */
public class Dog implements Prototype {

    String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }

    public String toString() {
        return "This dog says " + sound;
    }
}