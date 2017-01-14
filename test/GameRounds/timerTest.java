/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alouvoul
 */
public class timerTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class timer.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        boolean answer = true;
        timer instance = new timer();
        int expResult = 0;
        int result = instance.calculate(answer);
        assertEquals(expResult, result);
    }
    
}
