/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.IOException;
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
public class BuzzAppTest {
    
    public BuzzAppTest() {
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
     * Test of play method, of class BuzzApp.
     */
    @Test
    public void testPlay() throws IOException {
        System.out.println("play");
        BuzzApp instance;
        instance = new BuzzApp();
        Question expResult = null;
        Question result = instance.play();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerAnswer method, of class BuzzApp.
     */
    @Test
    public void testPlayerAnswer_String_int() throws IOException {
        System.out.println("playerAnswer");
        String playerAnswer = "";
        int i = 0;
        BuzzApp instance;
        instance = new BuzzApp();
        boolean expResult = false;
        boolean result = instance.playerAnswer(playerAnswer, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerAnswer method, of class BuzzApp.
     */
    @Test
    public void testPlayerAnswer_3args() throws IOException {
        System.out.println("playerAnswer");
        String playerAnswer = "";
        int i = 0;
        int pointsToBet = 0;
        BuzzApp instance;
        instance = new BuzzApp();
        boolean expResult = false;
        boolean result = instance.playerAnswer(playerAnswer, i, pointsToBet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseCategory method, of class BuzzApp.
     */
    @Test
    public void testChooseCategory() throws IOException {
        System.out.println("chooseCategory");
        String category = "";
        BuzzApp instance = new BuzzApp();
        instance.chooseCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionCategories method, of class BuzzApp.
     */
    @Test
    public void testGetQuestionCategories() throws IOException {
        System.out.println("getQuestionCategories");
        BuzzApp instance;
        instance = new BuzzApp();
        String[] expResult = null;
        String[] result = instance.getQuestionCategories();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class BuzzApp.
     */
    @Test
    public void testSetPlayers() throws IOException {
        System.out.println("setPlayers");
        String[] playerNames = null;
        BuzzApp instance;
        instance = new BuzzApp();
        instance.setPlayers(playerNames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class BuzzApp.
     */
    @Test
    public void testGetPlayers() throws IOException {
        System.out.println("getPlayers");
        BuzzApp instance;
        instance = new BuzzApp();
        Player[] expResult = null;
        Player[] result = instance.getPlayers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class BuzzApp.
     */
    @Test
    public void testGetType() throws IOException {
        System.out.println("getType");
        BuzzApp instance;
        instance = new BuzzApp();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocale method, of class BuzzApp.
     */
    @Test
    public void testSetLocale() throws IOException {
        System.out.println("setLocale");
        BuzzApp instance;
        instance = new BuzzApp();
        instance.setLocale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
