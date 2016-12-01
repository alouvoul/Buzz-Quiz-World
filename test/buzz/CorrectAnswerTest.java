/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import GameRounds.CorrectAnswer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class CorrectAnswerTest {
    
    private CorrectAnswer correctAnswer;
    
    @Before
    public void setUp() {
        correctAnswer = new CorrectAnswer();        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class CorrectAnswer.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        boolean answer = true;
        int expResult = 1000;
        int result = correctAnswer.calculate(answer);
        assertEquals(expResult, result);
    }
    
}
