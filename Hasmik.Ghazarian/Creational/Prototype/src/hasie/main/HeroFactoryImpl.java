package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public class HeroFactoryImpl implements HeroFactory {

    private Mage mage;
    private Beast beast;

    public HeroFactoryImpl(Mage mage, Beast beast) {
        this.mage = mage;
        this.beast = beast;
    }

    public Mage createMage() {
        try {
            return mage.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
