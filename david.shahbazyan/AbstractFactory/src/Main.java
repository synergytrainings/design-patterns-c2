/**
 * Created by david on 5/19/15.
 */
public class Main {
    public static void main(String[] args) {
        KeyGenerator keyGen = new KeyGeneratorImpl(1, 13, "David.Shahbazyan");
        if (args.length > 0) {
            switch (Integer.valueOf(args[0])) {
                case KeyMaker.PRODUCTID_RubyMine:
                    System.out.println(keyGen.generateKey(new RubyMineKeyMaker()));
                    break;
                case KeyMaker.PRODUCTID_PyCharm:
                    System.out.println(keyGen.generateKey(new PyCharmKeyMaker()));
                    break;
                case KeyMaker.PRODUCTID_WebStorm:
                    System.out.println(keyGen.generateKey(new WebStormKeyMaker()));
                    break;
                case KeyMaker.PRODUCTID_PhpStorm:
                    System.out.println(keyGen.generateKey(new PhpStormKeyMaker()));
                    break;
                case KeyMaker.PRODUCTID_AppCode:
                    System.out.println(keyGen.generateKey(new AppCodeKeyMaker()));
                    break;
                default:
                    break;
            }
        }
    }
}
