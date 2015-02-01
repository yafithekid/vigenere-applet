package cipher;

import helpers.StringHelper;

/**
 * @author yafithekid
 */
public class VigenereStandardAutoKey extends VigenereStandard {
    
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
        
        for(int i = 0; i< cipherText.length(); i++){
            plainText.append(this.decrypt(cipherText.charAt(i),keyText.charAt(i)));
        }
        return plainText.toString();
    }
    
    public String generateKey(String _text,String _key){
        String key = _key + _text;
        StringBuffer result = new StringBuffer();
        int j = 0;
        for(int i = 0; i < _text.length(); i++){
            if ('A' <= _text.charAt(i) && _text.charAt(i) <= 'Z'){
                while (! ('A' <= key.charAt(j) && key.charAt(j) <= 'Z')) j++;
                result.append(key.charAt(j));
                j++;
            } else {
                result.append(' ');
            }
        }
        return result.toString();
    }
}
