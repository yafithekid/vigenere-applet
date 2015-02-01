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
public class VigenereExtendedAutoKeyTest {
    
    public VigenereExtendedAutoKeyTest() {
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


    
    @Test
    public void testGenerateKeyNoSpace(){
        String text = "THISPLAINTEXT";
        String key = "SONY";
        String expResult = "SONYTHISPLAIN";
        VigenereExtendedAutoKey instance = new VigenereExtendedAutoKey();
        assertEquals(expResult,instance.generateKey(text, key));
    }
    @Test
    public void testGenerateKey(){
        String text = "THIS PLAIN TEXT";
                    //"SONYTHIS PLAIN "
        String key = "SONY";
        String expResult = "SONYTHIS PLAIN ";
        VigenereExtendedAutoKey instance = new VigenereExtendedAutoKey();
        assertEquals(expResult,instance.generateKey(text, key));
    }
}
