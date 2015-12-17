package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public abstract class Beast extends Prototype {

    @Override
    public abstract Beast clone() throws CloneNotSupportedException;
}
