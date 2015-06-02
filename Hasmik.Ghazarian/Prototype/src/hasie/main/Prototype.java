package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public abstract class Prototype implements Cloneable {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;
}
