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
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public abstract class Round {
    /**
     * Variable that stores the current answer.
     */
    private Question question;
    /**
     * Points for each type. Initialize by constructors.
     */
    float points;
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
     * Setter of points.
     * @param points 
     */
    public void setPoints(float points) {
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
            return (int)points;
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
