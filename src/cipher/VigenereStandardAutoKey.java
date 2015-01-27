package cipher;

/**
 * @author yafithekid
 */
public class VigenereStandardAutoKey extends VigenereStandard {
    
    @Override
    public String encrypt(String _plainText, String _key) {
        String plainText = (new String(_plainText)).toUpperCase();
        String key = (new String(_key)).toUpperCase();
        
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
    public String decrypt(String _cipherText, String _key) {
        String cipherText = (new String(_cipherText)).toUpperCase();
        String key = (new String(_key)).toUpperCase();
        
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
