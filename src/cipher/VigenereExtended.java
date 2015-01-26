package cipher;

import java.util.HashMap;

/**
 *
 * @author yafithekid
 */
public class VigenereExtended extends VigenereStandard {
    public int MOD = 256;
    @Override
    protected char encrypt(char _m,char _k){
        int m = _m, k = _k;
        int res = (m + k) % MOD;
        System.out.println(MOD);
        return (char) (res);
    }
    
    @Override
    protected char decrypt(char _m,char _k){
        int m = _m, k = _k;
        int res = (m - k) % MOD;
        if (res < 0) res += MOD;
        return (char) (res);
    }
   
}
