package prototype;

/**
 * Created by Luiza.Karapetyan on 6/2/15.
 */
public class Person implements Prototype {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    public String toString() {
        return "This person is named " + name;
    }
}