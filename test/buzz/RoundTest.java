/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import GameRounds.Round;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class RoundTest {
    
    private Round aRound;
    /**
     * Initialize round object.
     */
    @Before
    public void setUp() {
        aRound = new Round() {

            @Override
            public int calculate(boolean answer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
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
    
}
