package co.omise;

import co.omise.net.APIResource;

/**
 * Created by tin_hanc on 9/7/2015 AD.
 */
public class Omise {
    private static final String _OMISE_API_VERSION = "2014-07-27";
    private static final String _OMISE_JAVA_LIB_VERSION = "1.0.5";
    public static void setKeys(String _publicKey, String _secretKey) {
        APIResource.setPublicKey(_publicKey);
        APIResource.setSecretKey(_secretKey);
    }
    public static String getOmiseLibVersion(){return _OMISE_JAVA_LIB_VERSION;}
    public static String getOmiseAPIVersion(){return _OMISE_API_VERSION;}

}
