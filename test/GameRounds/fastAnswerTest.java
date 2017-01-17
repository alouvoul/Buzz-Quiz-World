/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class fastAnswerTest {
    /**
     * Constructor
     */
    public fastAnswerTest() {
    }

    /**
     * Test of calculate method, of class fastAnswer.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        boolean answer = false;
        fastAnswer instance = new fastAnswer();
        int expResult = 0;
        int result = instance.calculate(answer);
        assertEquals(expResult, result);
    }
    
}
