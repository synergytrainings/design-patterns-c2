package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/2/2015.
 */
public class App {

    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        Beast beast;

        factory = new HeroFactoryImpl(new ElfMage(), new ElfBeast());
        mage = factory.createMage();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(beast);

        factory = new HeroFactoryImpl(new OrcMage(), new OrcBeast());
        mage = factory.createMage();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(beast);
    }

}
