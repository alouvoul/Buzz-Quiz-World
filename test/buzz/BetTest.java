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
    
    private Bet bet;
    
    @Before
    public void setUp() {
        bet = new Bet();
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
        int expResult = 0;
        int result = bet.calculate(answer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculate2() {
        System.out.println("Calculate");
        boolean answer = false;
        int expResult = 0;
        int result = bet.calculate(answer);
        assertEquals(expResult, result);
    }
    
}
