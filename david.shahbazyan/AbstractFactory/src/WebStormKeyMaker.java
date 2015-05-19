import java.math.BigInteger;

/**
 * Created by david on 5/19/15.
 */
public class WebStormKeyMaker extends KeyMaker {
    @Override
    String getKey(int minorVersion, int majorVersion, String userName) {
        BigInteger pubKey = new BigInteger("BB62FBB57F105CD61B47AE2290FCB3CE1179942DE171BEDDF6BAA1A521B9368B735C7C931902EBA8DE6D160711A6ECC40F4A5E766E9FCDEE8A38715DB572AD3D", 16);
        BigInteger privKey = new BigInteger("7BFADCB153F59E86E69BC1820B4DB72573786E6B00CB824E57AD59BFE915231972746F47C6FBE0D8D88809DA313C1E4BEAD305AD8AFD31AE116ABCB181FF4F21", 16);

        return generateKey(privKey, pubKey, LICENSETYPE_NON_COMMERCIAL, PRODUCTID_WebStorm, minorVersion, majorVersion, userName);
    }
}
