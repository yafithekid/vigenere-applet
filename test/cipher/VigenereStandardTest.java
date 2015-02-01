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
public class VigenereStandardTest {
    
    public VigenereStandardTest() {
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
     * Test of encrypt method, of class VigenereStandard.
     */
    @Test
    public void testEncrypt_char_char() {
        System.out.println("encrypt");
        char _m = 'T';
        char _k = 'E';
        VigenereStandard instance = new VigenereStandard();
        char expResult = 'X';
        char result = instance.encrypt(_m, _k);
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class VigenereStandard.
     */
    @Test
    public void testDecrypt_char_char() {
        System.out.println("decrypt");
        char _m = 'X';
        char _k = 'E';
        VigenereStandard instance = new VigenereStandard();
        char expResult = 'T';
        char result = instance.decrypt(_m, _k);
        assertEquals(expResult, result);
    }

    /**
     * Test of encrypt method, of class VigenereStandard.
     */
    @Test
    public void testEncrypt_String_String() {
        System.out.println("encrypt");
        String plainText = "ATTACKATDAWN";
        String key = "LEMON";
        VigenereStandard instance = new VigenereStandard();
        String expResult = "LXFOPVEFRNHR";
        String result = instance.encrypt(plainText, key);
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class VigenereStandard.
     */
    @Test
    public void testDecrypt_String_String() {
        System.out.println("decrypt");
        String cipherText = "LXFOPVEFRNHR";
        String key = "LEMON";
        VigenereStandard instance = new VigenereStandard();
        String expResult = "ATTACKATDAWN";
        String result = instance.decrypt(cipherText, key);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGenerateKey(){
        String text = "THIS PLAIN TEXT!";
        String key = "SONY";
        VigenereStandard instance = new VigenereStandard();
        String expResult = "SONY SONYS ONYS ";
        String result = instance.generateKey(text, key);
        assertEquals(expResult, result);
    }
}
