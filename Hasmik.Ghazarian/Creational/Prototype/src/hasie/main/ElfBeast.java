package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public class ElfBeast extends Beast {

    public ElfBeast() {
    }

    public ElfBeast(ElfBeast beast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven eagle";
    }
}
