public class Main {

    public static void main(String[] args) {
        Character character=new King("King1");
        character.setWeaponBehavior(new AxeBehavior());
        character.description();
        Character character1=new Queen("Queen1");
        character.setWeaponBehavior(new NoWeaponBehavior());
        character.description();

    }
}
