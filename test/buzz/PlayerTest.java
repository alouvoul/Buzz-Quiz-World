/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class PlayerTest {
    
    private Player player;
    /**
     * Initialize object with a name
     */
    @Before
    public void setUp() {
        player = new Player("Makos");
    }

    /**
     * Test of SetName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String name = player.GetName();
        player.SetName(name);
    }

    /**
     * Test of GetName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        
        String expResult = "Makos";
        String result = player.GetName();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        System.out.println("SetScore");
        int score = player.GetScore();
        player.SetScore(score);
    }

    /**
     * Test of GetScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("GetScore");
        int expResult = 0;
        int result = player.GetScore();
        assertEquals(expResult, result);
    }
    
}
