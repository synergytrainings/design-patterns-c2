import java.math.BigInteger;

/**
 * Created by david on 5/19/15.
 */
public class AppCodeKeyMaker extends KeyMaker {
    @Override
    String getKey(int minorVersion, int majorVersion, String userName) {
        BigInteger pubKey = new BigInteger("F0DD6995C4BD3223641C79C8608D74F32ED54A8BDAE468EB5AC53F1F1C8925E263F82317356BC73B1C82B520630250212416C99CB39A8B7C2611E35552E166B9", 16);
        BigInteger privKey = new BigInteger("81B5EAEF61A4B584839C26253781D63243CD4F38E3A74FAD3713B3FB7025978538F10E743456F24BB20D5792BFDCB76DB6162C3D5C77DB7B29906CBFC9114EA5", 16);

        return generateKey(privKey, pubKey, LICENSETYPE_NON_COMMERCIAL, PRODUCTID_AppCode, minorVersion, majorVersion, userName);
    }
}
