/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class BetTest {
    
    private Bet bet;
    /**
     * Initialize bet object.
     */
    @Before
    public void setUp() {
        bet = new Bet();
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
    
    /**
     * Test of calculate method, of class Bet.
     */
    @Test
    public void testCalculate2() {
        System.out.println("Calculate");
        boolean answer = false;
        int expResult = 0;
        int result = bet.calculate(answer);
        assertEquals(expResult, result);
    }
    
}
