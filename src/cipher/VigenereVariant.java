/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cipher;

import java.util.HashMap;

/**
 *
 * @author yafithekid
 */
public class VigenereVariant implements Cipher {
    
    public int MOD = 256;
    
    public char encrypt(char _m,char _k){
        int m = _m, k = _k;
        int c = (m + k) % MOD;
        return (char) c;
    }
    
    public char decrypt(char _d,char _k){
        int d = _d, k = _k;
        int p = (d - k) % MOD;
        if (p < MOD) p += MOD;
        return (char) p;
    }
    
    @Override
    public String encrypt(String _plainText, String key) {
        String plainText = (new String(_plainText));
        
        StringBuffer keyText = new StringBuffer();
        keyText.append(key);
        if (keyText.length() < plainText.length()){
            keyText.append(plainText);
        }
        StringBuffer cipherText = new StringBuffer();
        
        for(int i = 0; i < plainText.length(); i++){
            cipherText.append(this.encrypt(plainText.charAt(i),keyText.charAt(i)));
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String _cipherText, String key) {
        String cipherText = (new String(_cipherText));
        
        StringBuffer keyText = new StringBuffer();
        keyText.append(key);
        if (keyText.length() < cipherText.length()){
            keyText.append(cipherText);
        }
        StringBuffer plainText = new StringBuffer();
        
        for(int i = 0; i< cipherText.length(); i++){
            plainText.append(this.decrypt(cipherText.charAt(i),keyText.charAt(i)));
        }
        return plainText.toString();
    }
    
}
