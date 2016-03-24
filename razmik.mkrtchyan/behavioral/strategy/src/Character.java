/**
 * Created by Razmik on 3/23/2016.
 */
public abstract class Character {

    private WeaponBehavior weaponBehavior;
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public String getName() {
        return name;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public  abstract void description();
}
