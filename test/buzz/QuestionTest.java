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
    
    private Question quest;
    
    @Before
    public void setUp() {
        quest = new Question();
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
        quest.setAnswers(answers);
    }

    /**
     * Test of getAnswers method, of class Question.
     */
    @Test
    public void testGetAnswers() {
        System.out.println("getAnswers");
        String[] expResult = null;
        String[] result = quest.getAnswers();
        assertArrayEquals(expResult, result);
        }

    /**
     * Test of setQuestion method, of class Question.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = quest.getQuestion();
        quest.setQuestion(question);
    }

    /**
     * Test of getQuestion method, of class Question.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        String expResult = null;
        String result = quest.getQuestion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorrectAnswer method, of class Question.
     */
    @Test
    public void testGetCorrectAnswer() {
        System.out.println("getCorrectAnswer");
        String expResult = null;
        String result = quest.getCorrectAnswer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCorrectAnswer method, of class Question.
     */
    @Test
    public void testSetCorrectAnswer() {
        System.out.println("setCorrectAnswer");
        String correctAnswer = quest.getCorrectAnswer();
        quest.setCorrectAnswer(correctAnswer);    
    }

    /**
     * Test of setHasImage method, of class Question.
     */
    @Test
    public void testSetHasImage() {
        System.out.println("setHasImage");
        String hasImage = quest.getHasImage();
        quest.setHasImage(hasImage);
    }

    /**
     * Test of getHasImage method, of class Question.
     */
    @Test
    public void testGetHasImage() {
        System.out.println("getHasImage");
        String expResult = null;
        String result = quest.getHasImage();
        assertEquals(expResult, result);
    }
    
}
