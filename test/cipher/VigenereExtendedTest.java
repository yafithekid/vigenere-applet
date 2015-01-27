/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cipher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yafithekid
 */
public class VigenereExtendedTest {
    
    public VigenereExtendedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encrypt method, of class VigenereExtended.
     */
    @Test
    public void testEncrypt_char_char() {
        System.out.println("encrypt");
        char _m = (char) 97; //a
        char _k = (char) 224;
        VigenereExtended instance = new VigenereExtended();
        char expResult = 'A';
        char result = instance.encrypt(_m, _k);
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class VigenereExtended.
     */
    @Test
    public void testDecrypt_char_char() {
        System.out.println("decrypt");
        char _d = 'A';
        char _k = (char) 224;
        VigenereExtended instance = new VigenereExtended();
        char expResult = 'a';
        char result = instance.decrypt(_d, _k);
        assertEquals(expResult, result);
    }

    /**
     * Test of encrypt method, of class VigenereExtended.
     */
    @Test
    public void testEncrypt_String_String() {
        System.out.println("encrypt");
        String _plainText = "abcdef";
        StringBuffer key = new StringBuffer();
        key.append((char) 224);
        VigenereExtended instance = new VigenereExtended();
        String expResult = "ABCDEF";
        String result = instance.encrypt(_plainText, key.toString());
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class VigenereExtended.
     */
    @Test
    public void testDecrypt_String_String() {
        System.out.println("decrypt");
        String _cipherText = "ABCDEF";
        StringBuffer key = new StringBuffer();
        key.append((char) 224);
        VigenereExtended instance = new VigenereExtended();
        String expResult = "abcdef";
        String result = instance.decrypt(_cipherText,key.toString());
        assertEquals(expResult, result);
    }
    
}
