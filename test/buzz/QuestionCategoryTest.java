/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.IOException;
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
    
    private QuestionCategory questionCat;
    
    @Before
    public void setUp() throws IOException {
        questionCat = new QuestionCategory("Cat");
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
        String questionCategory = questionCat.getQuestionCategory();
        questionCat.setQuestionCategory(questionCategory);
    }

    /**
     * Test of getQuestionCategory method, of class QuestionCategory.
     */
    @Test
    public void testGetQuestionCategory() {
        System.out.println("getQuestionCategory");
        String expResult = "Bet";
        String result = questionCat.getQuestionCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsed method, of class QuestionCategory.
     */
    @Test
    public void testSetUsed() {
        System.out.println("setUsed");
        questionCat.setUsed();
    }

    /**
     * Test of getUsed method, of class QuestionCategory.
     */
    @Test
    public void testGetUsed() {
        System.out.println("getUsed");
        boolean expResult = false;
        boolean result = questionCat.getUsed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuestions method, of class QuestionCategory.
     */
    @Test
    public void testSetQuestions() throws Exception {
        System.out.println("setQuestions");
        questionCat.setQuestions();
    }

    /**
     * Test of getQuestions method, of class QuestionCategory.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        ArrayList<Question> expResult = null;
        ArrayList<Question> result = questionCat.getQuestions();
        assertEquals(expResult, result);
    }
    
}
