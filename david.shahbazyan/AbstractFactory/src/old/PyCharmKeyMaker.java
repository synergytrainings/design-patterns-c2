package old;

import java.math.BigInteger;

/**
 * Created by david on 5/19/15.
 */
public class PyCharmKeyMaker extends KeyMaker {
    @Override
    String getKey(int minorVersion, int majorVersion, String userName) {
        BigInteger pubKey = new BigInteger("D57B0596A03949D9A3BB0CD1F7931E405AE27D0E0AF4E562072B487B0DAB7F0874AA982E5383E75FF13D36CA9D8531AC1FA2ED7B11C8858E821C2D5FB48002DD", 16);
        BigInteger privKey = new BigInteger("406047D02363033D295DB7C0FD8A94DDCD4A6D71B5A622220C8D65DF0DC1409E0BDE26AF66B0AD717406C22FC8BEC3ED88C1B7091BA3443B6BFBA26120DE6A15", 16);

        return generateKey(privKey, pubKey, LICENSETYPE_NON_COMMERCIAL, PRODUCTID_PyCharm, minorVersion, majorVersion, userName);
    }
}
