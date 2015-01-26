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
public class VigenereStandard implements Cipher{

    public int MOD = 26;
    
    protected char encrypt(char _m,char _k){
        if (_m == ' '){
            return _m;
        }
        int m = _m - 'A', k = _k - 'A';
        int res = (m + k) % MOD;
        return (char) (res + 'A');
    }
    
    protected char decrypt(char _m,char _k){
        if (_m == ' '){
            return _m;
        }
        int m = _m - 'A', k = _k - 'A';
        int res = (m - k) % MOD;
        if (res < 0) res += MOD;
        return (char) (res + 'A');
    }
    
    @Override
    public String encrypt(String _plainText, String key) {
        String plainText = (new String(_plainText)).toUpperCase();
        
        StringBuffer keyText = new StringBuffer();
        while (keyText.length() < plainText.length()){
            keyText.append(key);
        }
        StringBuffer cipherText = new StringBuffer();
        
        for(int i = 0; i < plainText.length(); i++){
            cipherText.append(this.encrypt(plainText.charAt(i),keyText.charAt(i)));
        }
        return cipherText.toString();
    }

    @Override
    public String decrypt(String _cipherText, String key) {
        String cipherText = (new String(_cipherText)).toUpperCase();
        StringBuffer keyText = new StringBuffer();
        while (keyText.length() < cipherText.length()){
            keyText.append(key);
        }
        StringBuffer plainText = new StringBuffer();
        
        for(int i = 0; i < cipherText.length(); i++){
            plainText.append(this.decrypt(cipherText.charAt(i),keyText.charAt(i)));
        }
        return plainText.toString();
    }
    
}
