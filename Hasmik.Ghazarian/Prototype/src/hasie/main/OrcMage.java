package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public class OrcMage extends Mage {

    public OrcMage() {
    }

    public OrcMage(OrcMage mage) {
    }

    @Override
    public Mage clone() throws CloneNotSupportedException {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "Orcish mage";
    }
}
