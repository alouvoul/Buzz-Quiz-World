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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of SetName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String name = "Makos";
        Player instance = new Player(name);
        instance.SetName(name);
        
    }

    /**
     * Test of GetName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        Player instance = new Player("Makos");
        String expResult = "Makos";
        String result = instance.GetName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        System.out.println("SetScore");
        int score = 0;
        Player instance = new Player("Makos");
        instance.SetScore(score);

    }

    /**
     * Test of GetScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("GetScore");
        Player instance = new Player("Makos");
        int expResult = 0;
        int result = instance.GetScore();
        assertEquals(expResult, result);

    }
    
}
