package cipher;

import helpers.StringHelper;
import java.util.HashMap;

/**
 *
 * @author yafithekid
 */
public class VigenereExtended implements Cipher{
    public int MOD = 256;
    
    public char encrypt(char _m,char _k){
        int m = _m, k = _k;
        int c = (m + k) % MOD;
        return (char) c;
    }
    
    public char decrypt(char _d,char _k){
        int d = _d, k = _k;
        int p = (d - k) % MOD;
        if (p < 0) p += MOD;
        return (char) p;
    }
    
    @Override
    public String encrypt(String _plainText, String key) {
        String plainText = (new String(_plainText));  
        String keyText = this.generateKey(plainText, key);
        StringBuffer cipherText = new StringBuffer();
        for(int i = 0; i < plainText.length(); i++){
            cipherText.append(this.encrypt(plainText.charAt(i),keyText.charAt(i)));
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String _cipherText, String key) {
        String cipherText = (new String(_cipherText));
        
        String keyText = this.generateKey(cipherText, key);
        StringBuffer plainText = new StringBuffer();
        
        for(int i = 0; i< cipherText.length(); i++){
            plainText.append(this.decrypt(cipherText.charAt(i),keyText.charAt(i)));
        }
        return plainText.toString();
    }

    @Override
    public String generateKey(String text, String _key) {
        String key = _key;
        StringBuffer result = new StringBuffer();
        while (result.length() < text.length()){
            result.append(key);
        }
        return result.toString();
    }
   
}
