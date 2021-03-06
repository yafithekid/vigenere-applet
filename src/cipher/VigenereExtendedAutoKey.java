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
public class VigenereExtendedAutoKey extends VigenereExtended {
   
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
    public String generateKey(String text,String key){
        String realKey = key + text;
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < text.length(); i++){
            result.append(realKey.charAt(i));
        }
        return result.toString();
    }
}
