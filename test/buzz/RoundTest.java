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
public class RoundTest {
    
    public RoundTest() {
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
     * Test of setPoints method, of class Round.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int points = 0;
        Round instance = new RoundImpl();
        instance.setPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestions method, of class Round.
     */
    @Test
    public void testSetQuestions() {
        System.out.println("setQuestions");
        Question questions = null;
        Round instance = new RoundImpl();
        instance.setQuestions(questions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class Round.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        String answer = "";
        Round instance = new RoundImpl();
        int expResult = 0;
        int result = instance.getPoints(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class Round.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        boolean answer = false;
        Round instance = new RoundImpl();
        int expResult = 0;
        int result = instance.calculate(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RoundImpl extends Round {

        public int calculate(boolean answer) {
            return 0;
        }
    }
    
}
