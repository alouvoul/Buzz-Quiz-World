/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class BetTest {
    
    public BetTest() {
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
     * Test of calculate method, of class Bet.
     */
    @Test
    public void testCalculate() {
        System.out.println("Calculate");
        boolean answer = true;
        Bet instance = new Bet();
        int expResult = 0;
        int result = instance.calculate(answer);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCalculate2() {
        System.out.println("Calculate");
        boolean answer = false;
        Bet instance = new Bet();
        int expResult = 0;
        int result = instance.calculate(answer);
        assertEquals(expResult, result);

    }
    
}
