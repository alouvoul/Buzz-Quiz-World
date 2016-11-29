/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;


/**
 * Class that declares the question object,
 * contains basic methods for reading the question and the (correct) answer,
 * also checks if a question has image or not. 
 * 
 * @author alouvoul
 */
public class Question {
    private String question;
    private String[] answers;
    private String correctAnswer;
    private String hasImage;

    /**
     * Constructor of the class.
     */
    public Question() {
        hasImage = null;
    }
    /**
     * Setter for answers.
     * @param answers 
     */
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
    /**
     * Getter of answers.
     * @return 
     */
    public String[] getAnswers() {
        return answers;
    }

    /**
     * Setter for question.
     * @param question 
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * Getter for question.
     * @return 
     */
    public String getQuestion() {
        return question;
    }
    /**
     * Getter of correct answer.
     * @return 
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    /**
     * Setter of correct answer.
     * @param correctAnswer from the text file
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    /**
     * Set if there is image or not.
     * @param hasImage if there is image
     */
    public void setHasImage(String hasImage) {
        this.hasImage = hasImage;
    }
    /**
     * Get image if exists.
     * @return if there is image
     */
    public String getHasImage() {
        return hasImage;
    }  
}
