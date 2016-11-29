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
public class RandomGenerateTest {
    
    public RandomGenerateTest() {
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
     * Test of generateRandoms method, of class RandomGenerate.
     */
    @Test
    public void testGenerateRandoms_int_int() {
        System.out.println("generateRandoms");
        int start = 0;
        int end = 0;
        RandomGenerate instance = new RandomGenerate();
        int[] expResult = null;
        int[] result = instance.generateRandoms(start, end);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateRandoms method, of class RandomGenerate.
     */
    @Test
    public void testGenerateRandoms_int() {
        System.out.println("generateRandoms");
        int end = 0;
        RandomGenerate instance = new RandomGenerate();
        int[] expResult = null;
        int[] result = instance.generateRandoms(end);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateRandoms method, of class RandomGenerate.
     */
    @Test
    public void testGenerateRandoms_3args() {
        System.out.println("generateRandoms");
        int start = 0;
        int end = 0;
        String[] array = null;
        RandomGenerate instance = new RandomGenerate();
        String[] expResult = null;
        String[] result = instance.generateRandoms(start, end, array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
