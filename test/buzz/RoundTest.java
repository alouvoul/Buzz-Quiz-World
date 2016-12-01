/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import GameRounds.Round;
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
public class RoundTest {
    
    private Round aRound;
    
    @Before
    public void setUp() {
        aRound = new Round() {

            @Override
            public int calculate(boolean answer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
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
        aRound.setPoints(points);
    }

    /**
     * Test of setQuestions method, of class Round.
     */
    @Test
    public void testSetQuestions() {
        System.out.println("setQuestions");
        Question questions = null;
        aRound.setQuestions(questions);
    }

    public class RoundImpl extends Round {

        public int calculate(boolean answer) {
            return 0;
        }
    }
    
}
