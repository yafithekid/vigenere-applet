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
 * @author yafi
 */
public class VigenereStandardAutoKeyTest {
    
    public VigenereStandardAutoKeyTest() {
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
     * Test of generateKey method, of class VigenereStandardAutoKey.
     */
    @Test
    public void testGenerateKey() {
        System.out.println("generateKey");
        String _text = "THIS PLAIN TEXT";
                    //  SONY THISP LAIN
        String _key = "SONY";
        VigenereStandardAutoKey instance = new VigenereStandardAutoKey();
        String expResult = "SONY THISP LAIN";
        String result = instance.generateKey(_text, _key);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNoSpaceGenerateKey(){
        System.out.println("no space generate key");
        String _text = "THISPLAINTEXT";
        String _key = "SONY";
        VigenereStandardAutoKey instance = new VigenereStandardAutoKey();
        String expResult = "SONYTHISPLAIN";
        String result = instance.generateKey(_text, _key);
        assertEquals(expResult, result);
    }
    
}
