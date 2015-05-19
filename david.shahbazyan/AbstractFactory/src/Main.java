/**
 * Created by david on 5/19/15.
 */
public class Main {
    public static void main(String[] args) {
        KeyMaker keyMaker = null;
        if (args.length > 0) {
            switch (Integer.valueOf(args[0])) {
                case KeyMaker.PRODUCTID_RubyMine:
                    keyMaker = new RubyMineKeyMaker();
                    break;
                case KeyMaker.PRODUCTID_PyCharm:
                    keyMaker = new PyCharmKeyMaker();
                    break;
                case KeyMaker.PRODUCTID_WebStorm:
                    keyMaker = new WebStormKeyMaker();
                    break;
                case KeyMaker.PRODUCTID_PhpStorm:
                    keyMaker = new PhpStormKeyMaker();
                    break;
                case KeyMaker.PRODUCTID_AppCode:
                    keyMaker = new AppCodeKeyMaker();
                    break;
                default:
                    break;
            }
        }
        if (keyMaker != null) {
            System.out.println(keyMaker.getKey(1, 13, "David.Shahbazyan"));
        }
    }
}
