/**
 * Created by david on 5/19/15.
 */
public class KeyGeneratorImpl implements KeyGenerator {
    private int minorVersion;
    private int majorVersion;
    private String userName;

    public KeyGeneratorImpl(int minorVersion, int majorVersion, String userName) {
        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.userName = userName;
    }

    @Override
    public String generateKey(KeyMaker keyMaker) {
        return keyMaker.getKey(minorVersion, majorVersion, userName);
    }
}
