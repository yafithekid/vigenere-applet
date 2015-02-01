/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cipher;

import helpers.StringHelper;
import java.util.HashMap;

/**
 *
 * @author yafithekid
 */
public class VigenereStandard implements Cipher{

    public int MOD = 26;
    
    protected char encrypt(char _m,char _k){
        if (!('A' <= _m && _m <= 'Z')){
            return _m;
        }
        int m = _m - 'A', k = _k - 'A';
        int res = (m + k) % MOD;
        return (char) (res + 'A');
    }
    
    protected char decrypt(char _m,char _k){
        if (!('A' <= _m && _m <= 'Z')){
            return _m;
        }
        int m = _m - 'A', k = _k - 'A';
        int res = (m - k) % MOD;
        if (res < 0) res += MOD;
        return (char) (res + 'A');
    }
    
    @Override
    public String encrypt(String _plainText, String _key) {
        String plainText = (new String(_plainText)).toUpperCase();
        String key = (new String(_key)).toUpperCase();
        
        String keyText = this.generateKey(plainText, key);
        StringBuffer cipherText = new StringBuffer();
        
        for(int i = 0; i < plainText.length(); i++){
            cipherText.append(this.encrypt(plainText.charAt(i),keyText.charAt(i)));
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String _cipherText, String _key) {
        String cipherText = (new String(_cipherText)).toUpperCase();
        String key = (new String(_key)).toUpperCase();
        String keyText = this.generateKey(cipherText, key);
        StringBuffer plainText = new StringBuffer();
        
        for(int i = 0; i < cipherText.length(); i++){
            plainText.append(this.decrypt(cipherText.charAt(i),keyText.charAt(i)));
        }
        return plainText.toString();
    }
    
    @Override
    public String generateKey(String text,String _key){
        String key = StringHelper.clearSpaces(_key);
        int i = 0, j = 0;
        StringBuffer result = new StringBuffer();
        while (i < text.length()){
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z'){
                result.append(key.charAt(j));
                j = (j + 1) % key.length();
            } else {
                result.append(' ');
            }
            i++;
        }
        return result.toString();
    }
}
