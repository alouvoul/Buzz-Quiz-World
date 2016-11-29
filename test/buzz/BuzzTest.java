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
public class BuzzTest {
    
    public BuzzTest() {
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
     * Test of main method, of class Buzz.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Buzz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HandleGame method, of class Buzz.
     */
    @Test
    public void testHandleGame() throws IOException {
        System.out.println("HandleGame");
        Buzz instance = new Buzz();
        instance.HandleGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitializeGame method, of class Buzz.
     */
    @Test
    public void testInitializeGame() throws IOException {
        System.out.println("InitializeGame");
        Buzz instance = new Buzz();
        instance.InitializeGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlayerSetup method, of class Buzz.
     */
    @Test
    public void testPlayerSetup() throws IOException {
        System.out.println("PlayerSetup");
        Buzz instance = new Buzz();
        instance.PlayerSetup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChooseQuestions method, of class Buzz.
     */
    @Test
    public void testChooseQuestions() throws IOException {
        System.out.println("ChooseQuestions");
        Buzz instance = new Buzz();
        String expResult = "";
        String result = instance.ChooseQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
