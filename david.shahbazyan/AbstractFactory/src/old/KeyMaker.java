package old;

import java.math.BigInteger;
import java.util.Random;
import java.util.zip.CRC32;

/**
 * Created by david on 5/19/15.
 */
public abstract class KeyMaker {
    public static final int LICENSETYPE_COMMERCIAL = 0;
    public static final int LICENSETYPE_NON_COMMERCIAL = 1;
    public static final int LICENSETYPE_SITE = 2;
    public static final int LICENSETYPE_OPENSOURCE = 3;
    public static final int LICENSETYPE_PERSONAL = 4;
    public static final int LICENSETYPE_YEARACADEMIC = 5;

    public static final int PRODUCTID_RubyMine = 4;
    public static final int PRODUCTID_PyCharm = 5;
    public static final int PRODUCTID_WebStorm = 6;
    public static final int PRODUCTID_PhpStorm = 7;
    public static final int PRODUCTID_AppCode = 8;

    private Random random = new Random();

    private String getLicenseId() {
        return String.format("D%sT", Integer.toString(random.nextInt(90000) + 10000));
    }

    private short getCRC(String s, int i, byte bytes[]) {
        CRC32 crc32 = new CRC32();
        if (s != null)
        {
            for (int j = 0; j < s.length(); j++)
            {
                char c = s.charAt(j);
                crc32.update(c);
            }
        }
        crc32.update(i);
        crc32.update(i >> 8);
        crc32.update(i >> 16);
        crc32.update(i >> 24);
        for (int k = 0; k < bytes.length - 2; k++)
        {
            byte byte0 = bytes[k];
            crc32.update(byte0);
        }
        return (short) (int) crc32.getValue();
    }

    private byte[] generateKeyBytes(int licenseType, int productId, int minorVersion, int majorVersion, String userName, int customerId) {
        byte[] keyBytes = new byte[14];
        keyBytes[0] = (byte)((licenseType << 4) + (productId & 0xFF));
        keyBytes[1] = (byte)((minorVersion << 4) + (majorVersion & 0xFF));
        long time = System.currentTimeMillis() >> 16;
        keyBytes[2] = (byte)(int)(time & 0xFF);
        keyBytes[3] = (byte)(int)(time >> 8 & 0xFF);
        keyBytes[4] = (byte)(int)(time >> 16 & 0xFF);
        keyBytes[5] = (byte)(int)(time >> 24 & 0xFF);
        long timeDiff = 99*365;

        timeDiff &= 65535L;
        keyBytes[6] = (byte)(int)(timeDiff & 0xFF);
        keyBytes[7] = (byte)(int)(timeDiff >> 8 & 0xFF);
        keyBytes[8] = 0;
        keyBytes[9] = 1;
        keyBytes[10] = 2;
        keyBytes[11] = 3;
        keyBytes[12] = 4;
        keyBytes[13] = 5;

        int crc32 = getCRC(userName, customerId, keyBytes);
        keyBytes[12] = (byte)(crc32 & 0xFF);
        keyBytes[13] = (byte)(crc32 >> 8 & 0xFF);

        return keyBytes;
    }

    public String generateKey(BigInteger privKey, BigInteger pubKey, int licenseType, int productId, int minorVersion, int majorVersion, String userName) {

        int customerId = random.nextInt(9000) + 1000;
        byte[] keyBytes = generateKeyBytes(licenseType, productId, minorVersion, majorVersion, userName, customerId);

        RSAEncoder encoder = new RSAEncoder(privKey, pubKey, 64, false);
        String serial = encoder.encode(keyBytes);

        serial = "===== LICENSE BEGIN =====\n" + customerId + "-" + getLicenseId() + "\n" + serial + "\n===== LICENSE END =====";
        return serial;
    }

    abstract String getKey(int minorVersion, int majorVersion, String userName);
}
