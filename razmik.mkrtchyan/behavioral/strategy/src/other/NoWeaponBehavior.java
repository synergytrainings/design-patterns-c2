package other;

/**
 * Created by Razmik.Mkrtchyan on 3/24/2016.
 */
public class NoWeaponBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        throw new IllegalStateException("sss");
    }

    @Override
    public void weaponDescription() {
        System.out.println("no weapon");
    }
}
