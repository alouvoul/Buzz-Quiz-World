/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

import buzz.Question;

/**
 * Class to initialize each round, it is parent of different categories of the
 * game and contains the basic functions for each category.
 * 
 * @author alouvoul
 */
public abstract class Round {
    private Question question;
    int points;
    int round;
    
    /**
     * Constructor of the class.
     */
    public Round() {
    }

    /**
     * Setter of points.
     * @param points 
     */
    public void setPoints(int points) {
        this.points = points;
    }
    
    /**
     * Setter of questions.
     * @param questions 
     */
    public void setQuestions(Question questions) {
        this.question = questions;
    }
    
    /**
     * Getter of points.
     * @param answer
     * @return number of points
     */
    public int getPoints(String answer){
        if(question.getCorrectAnswer().equals(answer)){
            return points;
        }
        
        return 0;
    }
    /**
     * Abstract class which is used from child classes of Round.
     * 
     * @param answer
     * @return 
     */
    abstract public int calculate(boolean answer);
}
