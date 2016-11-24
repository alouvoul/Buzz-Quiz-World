/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;


/**
 *
 * @author alouvoul
 */
public class Question {
    private String question;
    private String[] answers;
    private String correctAnswer;
    private String hasImage;
    
    public Question() {
        hasImage = null;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String[] getAnswers() {
        return answers;
    }

    
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setHasImage(String hasImage) {
        this.hasImage = hasImage;
    }

    public String getHasImage() {
        return hasImage;
    }
    
    
}
