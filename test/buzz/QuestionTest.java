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
public class QuestionTest {
    
    public QuestionTest() {
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
     * Test of setAnswers method, of class Question.
     */
    @Test
    public void testSetAnswers() {
        System.out.println("setAnswers");
        String[] answers = null;
        Question instance = new Question();
        instance.setAnswers(answers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswers method, of class Question.
     */
    @Test
    public void testGetAnswers() {
        System.out.println("getAnswers");
        Question instance = new Question();
        String[] expResult = null;
        String[] result = instance.getAnswers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class Question.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = "";
        Question instance = new Question();
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class Question.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorrectAnswer method, of class Question.
     */
    @Test
    public void testGetCorrectAnswer() {
        System.out.println("getCorrectAnswer");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getCorrectAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorrectAnswer method, of class Question.
     */
    @Test
    public void testSetCorrectAnswer() {
        System.out.println("setCorrectAnswer");
        String correctAnswer = "";
        Question instance = new Question();
        instance.setCorrectAnswer(correctAnswer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasImage method, of class Question.
     */
    @Test
    public void testSetHasImage() {
        System.out.println("setHasImage");
        String hasImage = "";
        Question instance = new Question();
        instance.setHasImage(hasImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHasImage method, of class Question.
     */
    @Test
    public void testGetHasImage() {
        System.out.println("getHasImage");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getHasImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
