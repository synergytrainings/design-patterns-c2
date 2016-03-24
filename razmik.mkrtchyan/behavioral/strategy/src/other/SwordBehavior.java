package other;

/**
 * Created by Razmik on 3/24/2016.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("SwordBehavior");
    }

    @Override
    public void weaponDescription() {
        System.out.println("SwordBehavior");
    }
}
