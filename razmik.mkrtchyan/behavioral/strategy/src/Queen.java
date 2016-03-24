/**
 * Created by Razmik on 3/24/2016.
 */
public class Queen extends Character {
    public Queen(String name) {
        super(name);
    }

    @Override
    public void description() {
        System.out.println("Quin name is"+getName());
        getWeaponBehavior().weaponDescription();
    }

}
