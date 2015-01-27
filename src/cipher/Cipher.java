package cipher;

import java.util.HashMap;

/**
 * interface for encrypt/decrypt string
 * @author yafithekid
 */

public interface Cipher {
    /**
     * @param pText plain text
     * @param key
     * @param options
     * @return encryted string
     */
    public String encrypt(String pText,String key);
   
    /**
     * 
     * @param cText encrypted text
     * @return decrypted string
     */
    public String decrypt(String cText,String key);
}

