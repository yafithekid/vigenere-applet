/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

/**
 *
 * @author yafithekid
 */
public class StringHelper {
    public static String clearSpaces(String x){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < x.length(); i++){
            if (x.charAt(i) != ' '){
                sb.append(x.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static String toUpper(String x){
        String ret = new String(x);
        return ret.toUpperCase();
    }
    
    public static String fiveSpaces(String x){
        StringBuffer sb = new StringBuffer();
        int counter = 0;
        for(int i = 0; i < x.length(); i++){
            if (x.charAt(i) != ' '){
                sb.append(x.charAt(i));
                counter = (counter + 1) % 5;
                if (counter == 0 && (i != x.length() - 1)){
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }
}
