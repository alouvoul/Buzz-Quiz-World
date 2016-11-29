/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.util.ArrayList;
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
public class QuestionCategoryTest {
    
    public QuestionCategoryTest() {
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
     * Test of setQuestionCategory method, of class QuestionCategory.
     */
    @Test
    public void testSetQuestionCategory() {
        System.out.println("setQuestionCategory");
        String questionCategory = "";
        QuestionCategory instance = null;
        instance.setQuestionCategory(questionCategory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionCategory method, of class QuestionCategory.
     */
    @Test
    public void testGetQuestionCategory() {
        System.out.println("getQuestionCategory");
        QuestionCategory instance = null;
        String expResult = "";
        String result = instance.getQuestionCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsed method, of class QuestionCategory.
     */
    @Test
    public void testSetUsed() {
        System.out.println("setUsed");
        QuestionCategory instance = null;
        instance.setUsed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsed method, of class QuestionCategory.
     */
    @Test
    public void testGetUsed() {
        System.out.println("getUsed");
        QuestionCategory instance = null;
        boolean expResult = false;
        boolean result = instance.getUsed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestions method, of class QuestionCategory.
     */
    @Test
    public void testSetQuestions() throws Exception {
        System.out.println("setQuestions");
        QuestionCategory instance = null;
        instance.setQuestions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestions method, of class QuestionCategory.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        QuestionCategory instance = null;
        ArrayList<Question> expResult = null;
        ArrayList<Question> result = instance.getQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
